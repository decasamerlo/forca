package main;

import javax.swing.JFrame;

import controle.CadastroC;
import controle.InicioC;
import modelo.Usuario;

public class Forca {
	
	private JFrame janela;
	Usuario usuarioLogado;
	
	InicioC cntInicio = new InicioC(this);
	CadastroC cntCadastro = new CadastroC(this);
	
	public Forca() {
		setJanela(new JFrame("O MELHOR JOGO DE FORCA"));
		getJanela().setLayout(null);
		getJanela().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getJanela().setSize(500,400);
		getJanela().setLocationRelativeTo(null);
		getJanela().setResizable(false);
		getJanela().setVisible(true);
		
		usuarioLogado = null;
	}
	
	public void iniciarPrograma() {
		getJanela().setContentPane(cntInicio.configuraTela());
	}
	
	public JFrame getJanela() {
		return janela;
	}

	public void setJanela(JFrame janela) {
		this.janela = janela;
	}
	
	public InicioC getCntInicio() {
		return cntInicio;
	}

	public CadastroC getCntCadastro() {
		return cntCadastro;
	}

}
