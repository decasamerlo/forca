package controle;

import javax.swing.JPanel;

import main.Forca;
import tela.LoginT;

public class LoginC {

	private Forca forca;
	private LoginT tela;

	public LoginC(Forca forca) {
		this.forca = forca;
		tela = new LoginT(this);
	}

	public JPanel configuraTela() {
		return tela.criaTela();
	}

}
