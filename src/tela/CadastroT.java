package tela;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controle.CadastroC;

public class CadastroT {
	private JPanel telaCadastro;
	private JLabel boasVindas, labelNome, labelCPF, labelEmail, labelSenha, labelConfSenha;
	private JButton cadastrar, voltar;
	private JTextField nome, cpf, email, senha, confSenha;
	private JPanel panelBotoes;
	private CadastroC cntCadastro;

	public CadastroT(CadastroC cadastroC) {
		this.cntCadastro = cadastroC;
		telaCadastro = new JPanel();
		telaCadastro.setLayout(null);
		telaCadastro.setSize(500, 400);

		// boas vindas
		boasVindas = new JLabel("Faça seu cadastro =)");
		boasVindas.setBounds(180, 20, 300, 30);
		telaCadastro.add(boasVindas);

		// campo de entrada de informacoes
		nome = new JTextField();
		nome.setBounds(150, 60, 300, 30);
		telaCadastro.add(nome);

		cpf = new JTextField();
		cpf.setBounds(150, 110, 300, 30);
		telaCadastro.add(cpf);

		email = new JTextField();
		email.setBounds(150, 160, 300, 30);
		telaCadastro.add(email);

		senha = new JPasswordField();
		senha.setBounds(150, 210, 300, 30);
		telaCadastro.add(senha);

		confSenha = new JPasswordField();
		confSenha.setBounds(150, 260, 300, 30);
		telaCadastro.add(confSenha);

		// labels de informacoes
		labelNome = new JLabel("Nome: ");
		labelNome.setBounds(50, 60, 100, 30);
		telaCadastro.add(labelNome);

		labelCPF = new JLabel("CPF: ");
		labelCPF.setBounds(50, 110, 100, 30);
		telaCadastro.add(labelCPF);

		labelEmail = new JLabel("E-mail: ");
		labelEmail.setBounds(50, 160, 100, 30);
		telaCadastro.add(labelEmail);

		labelSenha = new JLabel("Senha: ");
		labelSenha.setBounds(50, 210, 100, 30);
		telaCadastro.add(labelSenha);

		labelConfSenha = new JLabel("Conf.Senha: ");
		labelConfSenha.setBounds(50, 260, 100, 30);
		telaCadastro.add(labelConfSenha);

		panelBotoes = criaBotoes();
		telaCadastro.add(panelBotoes);
	}

	public JPanel criaBotoes() {
		JPanel panel = new JPanel(null);

		panel.setBounds(100, 60, 300, 300);

		// adicionando os botoes
		cadastrar = new JButton("Cadastre");
		cadastrar.setBounds(45, 250, 100, 30);
		cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cntCadastro.cadastrarUsuario();
			}
		});

		voltar = new JButton("Voltar");
		voltar.setBounds(165, 250, 100, 30);
		voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cntCadastro.voltar();
			}
		});

		panel.add(cadastrar);
		panel.add(voltar);

		return panel;
	}

	public JPanel criaTela() {
		return telaCadastro;
	}

}