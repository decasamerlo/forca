package tela;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import modelo.PalavrasForca;

import controle.JogoC;

public class JogoT {

	private JogoC cntJogo;
	private JPanel telaJogo;
	private JLabel imagemForca, dicas; 
	private ImageIcon icone;
	private PalavrasForca palavras;
	private JTextField[] a;
	
	public JogoT(JogoC cntJogo) {
		
		this.cntJogo = cntJogo;
		telaJogo = new JPanel();
		telaJogo.setLayout(null);
		telaJogo.setSize(500, 400);
		
		imagemForca = criaLabelImagem();
		telaJogo.add(imagemForca);
		
		//TODO TERMINAR DE ADICIONAR OS TEXT FIELDS E MONTAR A TELA FORCA
		

		
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

	public JPanel criaTela() {
		return telaJogo;
	}

	public JogoC getCntJogo() {
		return cntJogo;
	}

	public void setCntJogo(JogoC cntJogo) {
		this.cntJogo = cntJogo;
	}

	public JPanel getTelaJogo() {
		return telaJogo;
	}

	public void setTelaJogo(JPanel telaJogo) {
		this.telaJogo = telaJogo;
	}

	public JLabel getImagemForca() {
		return imagemForca;
	}

	public void setImagemForca(JLabel imagemForca) {
		this.imagemForca = imagemForca;
	}

	public JLabel getDicas() {
		return dicas;
	}

	public void setDicas(JLabel dicas) {
		this.dicas = dicas;
	}

	public ImageIcon getIcone() {
		return icone;
	}

	public void setIcone(ImageIcon icone) {
		this.icone = icone;
	}

	public PalavrasForca getPalavras() {
		return palavras;
	}

	public void setPalavras(PalavrasForca palavras) {
		this.palavras = palavras;
	}

	public JTextField[] getA() {
		return a;
	}

	public void setA(JTextField[] a) {
		this.a = a;
	}
	
	// TODO Adicionar lógica de conferência de letra a letra
	
}
