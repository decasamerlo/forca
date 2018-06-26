package controle;

import javax.swing.JPanel;

import main.Forca;
import modelo.Usuario;
import tela.InicioT;

public class InicioC {
	
	private Forca forca;
	private InicioT tela;
	
	public InicioC(Forca f) {
		this.forca = f;
		tela = new InicioT(this);
	}
	
	public JPanel configuraTela() {
		return tela.criaTela();
	}
	
	public void sair() {
		forca.getJanela().dispose();
	}

	public void cadastrar() {
		JPanel proxTela = forca.getCntCadastro().configuraTela();
		forca.getJanela().setContentPane(proxTela);
	}

	public void iniciarSemCadastro() {
		JPanel proxTela = forca.getCntJogo().configuraTela();
		forca.getJanela().setContentPane(proxTela);
		
		Usuario randomUser = new Usuario();
		randomUser.setCpf("99999999999");
		randomUser.setNome("RandomUser");
		forca.setUsuarioLogado(randomUser);
	}

	public void login() {
		JPanel proxTela = forca.getCntLogin().configuraTela();
		forca.getJanela().setContentPane(proxTela);
	}
	
}
