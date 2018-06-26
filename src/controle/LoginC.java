package controle;

import javax.swing.JPanel;

import main.Forca;
import modelo.Usuario;
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

	public void realizarLogin() {
		JPanel proxTela = forca.getCntJogo().configuraTela();
		forca.getJanela().setContentPane(proxTela);
		
		// TODO buscar informações na tela e setar no usuario
		Usuario usuario = new Usuario();
		usuario.setCpf(null);
		usuario.setDataDeNascimento(null);
		usuario.setNome(null);
		usuario.setSenha(null);
		forca.setUsuarioLogado(usuario);
	}

	public void voltar() {
		JPanel proxTela = forca.getCntInicio().configuraTela();
		forca.getJanela().setContentPane(proxTela);
	}

}
