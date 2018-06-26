package tela;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controle.LoginC;

public class LoginT {

	private JPanel telaLogin;
	private JLabel labelLogin, labelSenha;
	private JButton logar, voltar;
	private JTextField cpf, senha;
	private JPanel panelBotoes;
	private LoginC cntLogin;

	public LoginT(LoginC loginC) {
		this.cntLogin = loginC;
		telaLogin = new JPanel();
		telaLogin.setLayout(null);
		telaLogin.setSize(500, 400);

		// campo de texto
		cpf = new JTextField();
		cpf.setBounds(250, 90, 150, 30);
		telaLogin.add(cpf);

		// campo de senha
		senha = new JPasswordField();
		senha.setBounds(250, 140, 150, 30);
		telaLogin.add(senha);

		// login com cpf
		labelLogin = new JLabel("Digite seu CPF: ");
		labelLogin.setBounds(100, 90, 150, 30);
		telaLogin.add(labelLogin);

		// login com senha
		labelSenha = new JLabel("Digite sua Senha: ");
		labelSenha.setBounds(100, 140, 150, 30);
		telaLogin.add(labelSenha);

		// painel dos botoes
		panelBotoes = criaBotoes();
		telaLogin.add(panelBotoes);
	}

	public JPanel criaBotoes() {
		JPanel panel = new JPanel(null);

		panel.setBounds(100, 85, 300, 300);

		// adicionando os botoes
		logar = new JButton("Logar");
		logar.setBounds(45, 150, 100, 30);
		logar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cntLogin.realizarLogin();
			}
		});

		voltar = new JButton("Voltar");
		voltar.setBounds(165, 150, 100, 30);
		voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cntLogin.voltar();
			}
		});

		panel.add(logar);
		panel.add(voltar);

		return panel;
	}

	public JPanel criaTela() {
		return telaLogin;
	}

	public JPanel getTelaLogin() {
		return telaLogin;
	}

	public void setTelaLogin(JPanel telaLogin) {
		this.telaLogin = telaLogin;
	}

	public JLabel getLabelLogin() {
		return labelLogin;
	}

	public void setLabelLogin(JLabel labelLogin) {
		this.labelLogin = labelLogin;
	}

	public JLabel getLabelSenha() {
		return labelSenha;
	}

	public void setLabelSenha(JLabel labelSenha) {
		this.labelSenha = labelSenha;
	}

	public JButton getLogar() {
		return logar;
	}

	public void setLogar(JButton logar) {
		this.logar = logar;
	}

	public JButton getVoltar() {
		return voltar;
	}

	public void setVoltar(JButton voltar) {
		this.voltar = voltar;
	}

	public JTextField getCpf() {
		return cpf;
	}

	public void setCpf(JTextField cpf) {
		this.cpf = cpf;
	}

	public JTextField getSenha() {
		return senha;
	}

	public void setSenha(JTextField senha) {
		this.senha = senha;
	}

	public JPanel getPanelBotoes() {
		return panelBotoes;
	}

	public void setPanelBotoes(JPanel panelBotoes) {
		this.panelBotoes = panelBotoes;
	}

	public LoginC getCntLogin() {
		return cntLogin;
	}

	public void setCntLogin(LoginC cntLogin) {
		this.cntLogin = cntLogin;
	}
	
}
