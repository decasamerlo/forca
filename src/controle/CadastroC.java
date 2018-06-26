package controle;

import javax.swing.JPanel;

import main.Forca;
import modelo.Usuario;
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

	private JPanel configuraTelaSenhasDiferentes() {
		return tela.erroSenhasDiferentes();
	}
	
	private JPanel configuraTelaUsuarioExiste() {
		return tela.erroUsuarioExiste();
	}
	
	private void removeErros() {
		tela.removeErros();
	}

	public void cadastrarUsuario() {
		
		String cpf = tela.getCpf().getText();
		String nome = tela.getNome().getText();
		String senha = tela.getSenha().getText();
		String confSenha = tela.getConfSenha().getText();
		
		if (!iguais(senha, confSenha)) {
			JPanel proxTela = configuraTelaSenhasDiferentes();
			forca.getJanela().setContentPane(proxTela);
		} else {
			removeErros();
			Usuario usuario = forca.getDao().findOne(cpf);
			if (usuario == null) {
				usuario = new Usuario();
				usuario.setNome(nome);
				usuario.setCpf(cpf);
				usuario.setSenha(senha);
				forca.getDao().salvar(usuario);
				voltar();
			} else {
				JPanel proxTela = configuraTelaUsuarioExiste();
				forca.getJanela().setContentPane(proxTela);
			}
			System.out.println(usuario.getNome());
		}
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

	public void voltar() {
		JPanel proxTela = forca.getCntInicio().configuraTela();
		forca.getJanela().setContentPane(proxTela);
		
		tela.getConfSenha().setText("");
		tela.getSenha().setText("");
		tela.getCpf().setText("");
		tela.getEmail().setText("");
		tela.getNome().setText("");
	}

}
