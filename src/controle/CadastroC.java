package controle;

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

	public void cadastrarUsuario() {
		// TODO buscar informações na tela e salvar
		voltar();
	}

	public void voltar() {
		JPanel proxTela = forca.getCntInicio().configuraTela();
		forca.getJanela().setContentPane(proxTela);
	}

}
