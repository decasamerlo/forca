package controle;

import javax.swing.JPanel;

import main.Forca;
import tela.InicioT;

public class InicioC {
	
	private Forca f;
	private InicioT tela;
	
	public InicioC(Forca f) {
		this.f = f;
		tela = new InicioT(this);
	}
	
	public JPanel configuraTela() {
		return tela.criaTela();
	}
	
	public void sair() {
		f.getJanela().dispose();
	}
	
}
