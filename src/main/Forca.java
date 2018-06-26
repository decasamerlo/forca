package main;

import javax.swing.JFrame;

import controle.CadastroC;
import controle.InicioC;
import controle.JogoC;
import controle.LoginC;
import modelo.Usuario;

public class Forca {

	private JFrame janela;
	Usuario usuarioLogado;

	private InicioC cntInicio = new InicioC(this);
	private CadastroC cntCadastro = new CadastroC(this);
	private LoginC cntLogin = new LoginC(this);
	private JogoC cntJogo = new JogoC(this);

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

	public JFrame getJanela() {
		return janela;
	}

	public void setJanela(JFrame janela) {
		this.janela = janela;
	}
	
	public Usuario getUsuarioLogado() {
		return usuarioLogado;
	}

	public void setUsuarioLogado(Usuario randomUser) {
		this.usuarioLogado = randomUser;
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

	public JogoC getCntJogo() {
		return cntJogo ;
	}
	
	public void iniciarPrograma() {
		getJanela().setContentPane(cntInicio.configuraTela());
	}

}
