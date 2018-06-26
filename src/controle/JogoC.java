package controle;

<<<<<<< HEAD
import javax.swing.JPanel;

import main.Forca;
import tela.JogoT;

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
	
	public void sair() {
		f.getJanela().dispose();
	}
=======
import tela.JogoT;
import main.Forca;

public class JogoC {

	private Forca f;
	private JogoT tela;
>>>>>>> refs/remotes/origin/master
	
}
