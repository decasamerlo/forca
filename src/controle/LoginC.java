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
	
	private JPanel configuraTelaUsuarioErrado() {
		return tela.erroUsuarioErrado();
	}
	
	private JPanel configuraTelaSenhaErrada() {
		return tela.erroSenhaErrada();
	}
	
	private void removeErros() {
		tela.removeErros();
	}

	public void realizarLogin() {
		removeErros();

		String cpf = tela.getCpf().getText();
		String senha = tela.getSenha().getText();
		
		Usuario usuario = forca.getDao().findOne(cpf);
		
		if (usuario == null) {
			JPanel proxTela = configuraTelaUsuarioErrado();
			forca.getJanela().setContentPane(proxTela);
		} else {
			if (!iguais(senha, usuario.getSenha())) {
				JPanel proxTela = configuraTelaSenhaErrada();
				forca.getJanela().setContentPane(proxTela);
			} else {
				JPanel proxTela = forca.getCntJogo().configuraTela();
				forca.getJanela().setContentPane(proxTela);
				forca.setUsuarioLogado(usuario);
			}
		}
	}

	public void voltar() {
		JPanel proxTela = forca.getCntInicio().configuraTela();
		forca.getJanela().setContentPane(proxTela);
		
		tela.getSenha().setText("");
		tela.getCpf().setText("");
	}

	private boolean iguais(String senha, String confSenha) {
		if (senha != null) {
			if (senha.equals(confSenha)) {
				return true;
			} else {
				return false;
			}
		} else {
			if (confSenha == null) {
				return true;
			} else {
				return false;
			}
		}
	}
}
