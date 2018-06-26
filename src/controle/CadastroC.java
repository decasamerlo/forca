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
		
		if (senha != null) {
			if (senha.equals(confSenha)) {
				// TODO salvar usuario
				voltar();
			} else {
				JPanel proxTela = configuraTelaSenhasDiferentes();
				forca.getJanela().setContentPane(proxTela);
			}
		} else {
			if (confSenha == null) {
				//TODO salvar usuario
				voltar();
			} else {
				JPanel proxTela = configuraTelaSenhasDiferentes();
				forca.getJanela().setContentPane(proxTela);
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
