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

	private JPanel configuraTelaSenhasDiferentes() {
		return tela.erroSenhasDiferentes();
	}

	public void cadastrarUsuario() {
		
		String cpf = tela.getCpf().getText();
		String senha = tela.getSenha().getText();
		String confSenha = tela.getConfSenha().getText();
		
		System.out.println("Senha: " + senha);
		System.out.println("Conf: " + confSenha);
		
		if (diferente(senha, confSenha)) {
			JPanel proxTela = configuraTelaSenhasDiferentes();
			forca.getJanela().setContentPane(proxTela);
		} else {
			// TODO salvar usuario
			voltar();
		}
		
		diferente(senha, confSenha);
	}

	private boolean diferente(String senha, String confSenha) {
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
