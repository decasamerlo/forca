package tela;

import java.awt.Color;
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
	private JLabel erroUsuarioErrado, erroSenhaErrada;
	private JButton logar, voltar;
	private JTextField cpf, senha;
	private JPanel panelBotoes;
	private LoginC cntLogin;

	public LoginT(LoginC loginC) {
		this.cntLogin = loginC;
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
		telaLogin = new JPanel();
		telaLogin.setLayout(null);
		telaLogin.setSize(500, 400);

		// campo de texto
		cpf = new JTextField();
		cpf.setBounds(250, 100, 150, 30);
		telaLogin.add(cpf);

		// campo de senha
		senha = new JPasswordField();
		senha.setBounds(250, 150, 150, 30);
		telaLogin.add(senha);

		// login com cpf
		labelLogin = new JLabel("Digite seu CPF: ");
		labelLogin.setBounds(100, 100, 150, 30);
		telaLogin.add(labelLogin);

		// login com senha
		labelSenha = new JLabel("Digite sua Senha: ");
		labelSenha.setBounds(100, 150, 150, 30);
		telaLogin.add(labelSenha);
		
		erroUsuarioErrado = new JLabel("ERRO: Usuário não encontrado!");
		erroUsuarioErrado.setBounds(260, 130, 300, 20);
		erroUsuarioErrado.setForeground(Color.RED);
		erroUsuarioErrado.setVisible(false);
		telaLogin.add(erroUsuarioErrado);
		
		erroSenhaErrada = new JLabel("ERRO: Senha incorreta!");
		erroSenhaErrada.setBounds(260, 180, 300, 20);
		erroSenhaErrada.setForeground(Color.RED);
		erroSenhaErrada.setVisible(false);
		telaLogin.add(erroSenhaErrada);

		// painel dos botoes
		panelBotoes = criaBotoes();
		telaLogin.add(panelBotoes);
		
		return telaLogin;
	}
	
	public JPanel erroUsuarioErrado() {
		erroUsuarioErrado.setVisible(true);
		return telaLogin;
	}
	
	public JPanel erroSenhaErrada() {
		erroSenhaErrada.setVisible(true);
		return telaLogin;
	}
	
	public void removeErros() {
		erroUsuarioErrado.setVisible(false);
		erroSenhaErrada.setVisible(false);
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

	public JLabel getUsuarioErrado() {
		return erroUsuarioErrado;
	}

	public void setUsuarioErrado(JLabel usuarioErrado) {
		this.erroUsuarioErrado = usuarioErrado;
	}

	public JLabel getSenhaErrada() {
		return erroSenhaErrada;
	}

	public void setSenhaErrada(JLabel senhaErrada) {
		this.erroSenhaErrada = senhaErrada;
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
