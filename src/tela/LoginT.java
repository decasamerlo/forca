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

}
