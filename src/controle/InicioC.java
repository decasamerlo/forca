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
		JPanel t = tela.criaTela();
		forca.getJanela().setSize(t.getSize());
		return t;
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
		randomUser.setPontos(0);
		forca.getDao().salvar(randomUser);
	}

	public void login() {
		if (forca.getUsuarioLogado() == null) {
			JPanel proxTela = forca.getCntLogin().configuraTela();
			forca.getJanela().setContentPane(proxTela);
		} else {
			JPanel proxTela = forca.getCntJogo().configuraTela();
			forca.getJanela().setContentPane(proxTela);
		}
	}

}
