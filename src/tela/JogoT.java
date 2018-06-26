package tela;

<<<<<<< HEAD
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controle.JogoC;

public class JogoT {

	private static final int borda = 10;
	JPanel telaJogo;
	JPanel telaPalavra;
	JPanel telaForca;
	JPanel teclado;
	JogoC cntJogo;

	public JogoT(JogoC cntJogo) {
		this.cntJogo = cntJogo;
		
		telaJogo = new JPanel(null);
		telaPalavra = criaTelaPalavra();
		telaForca = criaTelaForca();
		teclado = criaTeclado();
		
		telaJogo.add(telaPalavra);
		telaJogo.add(telaForca);
		telaJogo.add(teclado);

	}


	private JPanel criaTelaPalavra() {
		JPanel panel = new JPanel(null);
		panel.setBounds(borda, borda, telaJogo.getWidth()-borda, borda);
		panel.setBackground(Color.black);
		return panel;
	}

	private JPanel criaTelaForca() {
		JPanel panel = new JPanel(null);
		panel.setBounds(borda, telaPalavra.getHeight()+borda, telaJogo.getWidth()-borda, borda);
		panel.setBackground(Color.blue);
		return panel;
	}

	private JPanel criaTeclado() {
		JPanel panel = new JPanel(null);
		panel.setBounds(borda, telaForca.getY() + telaForca.getHeight()
				 + borda, telaJogo.getWidth() - borda * 3, borda * 30);
		panel.setBackground(Color.YELLOW);
		return panel;
	}

	public JPanel getTelaJogo() {
		return telaJogo;
	}

	public void setTelaJogo(JPanel telaJogo) {
		this.telaJogo = telaJogo;
	}

	public JPanel getTelaForca() {
		return telaForca;
	}

	public void setTelaForca(JPanel telaForca) {
		this.telaForca = telaForca;
	}

	public JPanel getTeclado() {
		return teclado;
	}

	public void setTeclado(JPanel teclado) {
		this.teclado = teclado;
	}
	
	public JPanel criaTela() {
		return telaJogo;
	}

=======
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import modelo.PalavrasForca;

import controle.JogoC;

public class JogoT {

	private JogoC cntJogo;
	private JPanel jogo;
	private JLabel imagemForca, dicas; 
	private ImageIcon icone;
	private PalavrasForca palavras;
	private JTextField[] a;
	
	public JogoT(JogoC cntJogo) {
		
		this.cntJogo = cntJogo;
		jogo = new JPanel(null);
		
		imagemForca = criaLabelImagem();
		jogo.add(imagemForca);
		
		//TERMINAR DE ADICIONAR OS TEXT FIELDS E MONTAR A TELA FORCA
		

		
	}
	
	//LABEL APENAS PAR IMAGEM DA FORCA
	public JLabel criaLabelImagem(){
		JLabel label = new JLabel();
		
		label.setBounds(10, 10, 40, 40);
		
		return label;
	}
	
	//METÓDO PARA CRIAÇÃO DOS TEXTFIELD DE CARACTER SEM PODER CONFIGURAR
	public JPanel criaCampoCaracter(){
		JPanel panel = new JPanel(null);
		Random rand = new Random(15);
		int n = rand.nextInt();
		
		//Definindo o painel
		panel.setBounds(100, 85, 300, 300);
		
		 //Criar lógica para contar os caracteres da palavra
		palavras.retornoPalavra(n).length();
		
		//adicionando textfield		
		for(int i = 0; i < palavras.retornoPalavra(n).length(); i++){
			a = new JTextField[i];
			a[i].setBounds(10*i, 40, 10, 10);
			a[i].setEditable(false);
			panel.add(a[i]);
		}
		
		return panel;
	}

	//Adicionar lógica de conferência de letra a letra
	
>>>>>>> refs/remotes/origin/master
}
