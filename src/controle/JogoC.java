package controle;

import tela.JogoT;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
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

	public JogoC(Forca forca) {
		acertos = 0;
		erros = 0;
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
		} else if (!tela.getLabelDica2().isVisible()) {
			tela.getLabelDica2().setVisible(true);
		} else {
			tela.getLabelDica3().setVisible(true);
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
					}
				}
			}
			button.setBackground(Color.green);
		} else {
			// TODO implementar o número máximo de erros
			erros++;
			tela.setPanelForca(erros);
			button.setBackground(Color.red);
		}
		button.setEnabled(false);
	}

}