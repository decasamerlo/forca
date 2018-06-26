package main;

import javax.swing.JFrame;

import controle.CadastroC;
import controle.InicioC;
import controle.LoginC;
import modelo.Usuario;

public class Forca {

	private JFrame janela;
	Usuario usuarioLogado;

	private InicioC cntInicio = new InicioC(this);
	private CadastroC cntCadastro = new CadastroC(this);
	private LoginC cntLogin = new LoginC(this);

	public Forca() {
		setJanela(new JFrame("O MELHOR JOGO DE FORCA"));
		getJanela().setLayout(null);
		getJanela().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getJanela().setSize(500, 400);
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

	public LoginC getCntLogin() {
		return cntLogin;
	}

}
