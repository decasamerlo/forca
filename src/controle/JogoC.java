package controle;

import sun.awt.image.SurfaceManager.ProxiedGraphicsConfig;
import tela.JogoT;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import main.Forca;
import modelo.PalavrasForca;

public class JogoC {

	private Forca forca;
	private JogoT tela;
	private PalavrasForca palavrasForca;
	private String palavra;
	private int acertos;
	private int erros;
	private int dicasPedidas, pontos; 


	public JogoC(Forca forca) {
		acertos = 0;
		erros = 0;
		dicasPedidas = 4;
		palavrasForca = new PalavrasForca();
		this.forca = forca;
		tela = new JogoT(this);
	}

	public JPanel configuraTela() {
		Random rand = new Random();
		int n = rand.nextInt(15);
		palavra = palavrasForca.retornoPalavra(n);
		JPanel t = tela.criaTela(palavra, palavrasForca.retornoDica1(n), palavrasForca.retornoDica2(n),
				palavrasForca.retornoDica3(n));
		forca.getJanela().setSize(t.getSize());
		return t;
	}

	public void pedirDica() {
		if (!tela.getLabelDica1().isVisible()) {
			tela.getLabelDica1().setVisible(true);
			dicasPedidas--;
		} else if (!tela.getLabelDica2().isVisible()) {
			tela.getLabelDica2().setVisible(true);
			dicasPedidas--;
		} else {
			tela.getLabelDica3().setVisible(true);
			dicasPedidas--;
		}
	}

	public void desistir() {
		JPanel proxTela = forca.getCntInicio().configuraTela();
		forca.getJanela().setContentPane(proxTela);
	}
	
	public void teclaApertada(JButton button) {
		if (palavra.contains(button.getText())) {
			for (int j = 0; j < palavra.length(); j++) {
				if (button.getText().equals(Character.toString(palavra.charAt(j)))) {
					acertos++;
					tela.getLetras()[j].setText(button.getText());
					if (acertos == palavra.length()) {
						// TODO ganhou			
						pontos = (2*acertos*dicasPedidas) - erros;
						
						//zerando a imagem
						tela.setPanelForca(0);
						erros = 0;
						
						//Continuar no jogo ou sair do jogo
						int resposta = JOptionPane.showConfirmDialog(null, "Parabéns você fez "+pontos+" pontos! " +
								"Deseja jogar novamente?", "É Hexa!", JOptionPane.CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);						
						JPanel proxTela;
						if (resposta == JOptionPane.OK_OPTION)
						{
							proxTela = forca.getCntJogo().configuraTela();
							forca.getJanela().setContentPane(proxTela);
						}else{
							proxTela = forca.getCntInicio().configuraTela();
							forca.getJanela().setContentPane(proxTela);
						}

						
					}
				}
			}
			button.setBackground(Color.green);
		} else {
			// TODO implementar o n�mero m�ximo de erros
			erros++;
			tela.setPanelForca(erros);
			button.setBackground(Color.red);
			
			if(erros == 7){
				
				//zerando a imagem
				erros = 0;
				pontos = 0;
				tela.setPanelForca(0);
				
				
				//Continuar jogando ou sair do jogo
				int resposta = JOptionPane.showConfirmDialog(null, "Você foi enforcado! Deseja jogar novamente?", 
						"Acabou!", JOptionPane.CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
				JPanel proxTela;
				if (resposta == JOptionPane.OK_OPTION)
				{
					proxTela = forca.getCntJogo().configuraTela();
					forca.getJanela().setContentPane(proxTela);
				}else{
					proxTela = forca.getCntInicio().configuraTela();
					forca.getJanela().setContentPane(proxTela);
				}
				

			}
		}
		button.setEnabled(false);
	}

}