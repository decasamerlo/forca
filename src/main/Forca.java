package main;

import javax.swing.JFrame;

import controle.InicioC;
import modelo.Usuario;
import tela.LoginT;

public class Forca {
	
	private JFrame janela;
	Usuario usuarioLogado;
	
	InicioC cntInicio = new InicioC(this);
	
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
	
	public void cadastrar() {
		LoginT lt = new LoginT();
		lt.run();
	}

	public JFrame getJanela() {
		return janela;
	}

	public void setJanela(JFrame janela) {
		this.janela = janela;
	}

}
