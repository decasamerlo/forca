package controle;

import tela.JogoT;

import java.awt.Container;

import javax.swing.JPanel;

import main.Forca;

public class JogoC {

	private Forca f;
	private JogoT tela;
	
	public JogoC(Forca f) {
		this.f = f;
		tela = new JogoT(this);
	}

	public JPanel configuraTela() {
		return tela.criaTela();
	}
	
}