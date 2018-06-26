package controle;

import java.awt.Container;

import javax.swing.JPanel;

import main.Forca;
import tela.CadastroT;

public class CadastroC {

	private Forca forca;
	private CadastroT tela;

	public CadastroC(Forca forca) {
		this.forca = forca;
		this.tela = new CadastroT(this);
	}

	public JPanel configuraTela() {
		return tela.criaTela();
	}

}
