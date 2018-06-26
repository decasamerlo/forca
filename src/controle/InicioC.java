package controle;

import javax.swing.JPanel;

import main.Forca;
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
		forca.getJanela().setSize(proxTela.getWidth(), proxTela.getHeight());
		forca.getJanela().setContentPane(proxTela);
	}

	public void iniciarSemCadastro() {
		// TODO Auto-generated method stub

	}

	public void login() {
		JPanel proxTela = forca.getCntLogin().configuraTela();
		forca.getJanela().setSize(proxTela.getWidth(), proxTela.getHeight());
		forca.getJanela().setContentPane(proxTela);
	}
	
}
