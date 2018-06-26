package tela;

import java.awt.Color;
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
	private JLabel boasVindas, labelNome, labelCPF, labelSenha, labelConfSenha;
	private JLabel erroSenhasDiferentes, erroUsuarioExiste;
	private JButton cadastrar, voltar;
	private JTextField nome, cpf, email, senha, confSenha;
	private JPanel panelBotoes;
	private CadastroC cntCadastro;

	public CadastroT(CadastroC cadastroC) {
		this.cntCadastro = cadastroC;
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
		
		telaCadastro = new JPanel();
		telaCadastro.setLayout(null);
		telaCadastro.setSize(500, 400);

		// boas vindas
		boasVindas = new JLabel("Fa√ßa seu cadastro =)");
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

		labelSenha = new JLabel("Senha: ");
		labelSenha.setBounds(50, 210, 100, 30);
		telaCadastro.add(labelSenha);

		labelConfSenha = new JLabel("Conf.Senha: ");
		labelConfSenha.setBounds(50, 260, 100, 30);
		telaCadastro.add(labelConfSenha);
		
		erroUsuarioExiste = new JLabel("ERRO: J· existe usu·rio com este CPF!");
		erroUsuarioExiste.setBounds(160, 140, 300, 20);
		erroUsuarioExiste.setForeground(Color.RED);
		erroUsuarioExiste.setVisible(false);
		telaCadastro.add(erroUsuarioExiste);
		
		erroSenhasDiferentes = new JLabel("ERRO: Senhas diferentes!");
		erroSenhasDiferentes.setBounds(160, 240, 300, 20);
		erroSenhasDiferentes.setForeground(Color.RED);
		erroSenhasDiferentes.setVisible(false);
		telaCadastro.add(erroSenhasDiferentes);

		panelBotoes = criaBotoes();
		telaCadastro.add(panelBotoes);
		
		return telaCadastro;
	}
	
	public JPanel erroSenhasDiferentes() {
		erroSenhasDiferentes.setVisible(true);
		return telaCadastro;
	}
	
	public JPanel erroUsuarioExiste() {
		erroUsuarioExiste.setVisible(true);
		return telaCadastro;
	}
	
	public void removeErros() {
		erroSenhasDiferentes.setVisible(false);
		erroUsuarioExiste.setVisible(false);
	}

	public JPanel getTelaCadastro() {
		return telaCadastro;
	}

	public void setTelaCadastro(JPanel telaCadastro) {
		this.telaCadastro = telaCadastro;
	}

	public JLabel getBoasVindas() {
		return boasVindas;
	}

	public void setBoasVindas(JLabel boasVindas) {
		this.boasVindas = boasVindas;
	}

	public JLabel getLabelNome() {
		return labelNome;
	}

	public void setLabelNome(JLabel labelNome) {
		this.labelNome = labelNome;
	}

	public JLabel getLabelCPF() {
		return labelCPF;
	}

	public void setLabelCPF(JLabel labelCPF) {
		this.labelCPF = labelCPF;
	}

	public JLabel getLabelSenha() {
		return labelSenha;
	}

	public void setLabelSenha(JLabel labelSenha) {
		this.labelSenha = labelSenha;
	}

	public JLabel getLabelConfSenha() {
		return labelConfSenha;
	}

	public void setLabelConfSenha(JLabel labelConfSenha) {
		this.labelConfSenha = labelConfSenha;
	}

	public JLabel getErroSenhasDiferentes() {
		return erroSenhasDiferentes;
	}

	public void setErroSenhasDiferentes(JLabel erroSenhasDiferentes) {
		this.erroSenhasDiferentes = erroSenhasDiferentes;
	}

	public JButton getCadastrar() {
		return cadastrar;
	}

	public void setCadastrar(JButton cadastrar) {
		this.cadastrar = cadastrar;
	}

	public JButton getVoltar() {
		return voltar;
	}

	public void setVoltar(JButton voltar) {
		this.voltar = voltar;
	}

	public JTextField getNome() {
		return nome;
	}

	public void setNome(JTextField nome) {
		this.nome = nome;
	}

	public JTextField getCpf() {
		return cpf;
	}

	public void setCpf(JTextField cpf) {
		this.cpf = cpf;
	}

	public JTextField getEmail() {
		return email;
	}

	public void setEmail(JTextField email) {
		this.email = email;
	}

	public JTextField getSenha() {
		return senha;
	}

	public void setSenha(JTextField senha) {
		this.senha = senha;
	}

	public JTextField getConfSenha() {
		return confSenha;
	}

	public void setConfSenha(JTextField confSenha) {
		this.confSenha = confSenha;
	}

	public JPanel getPanelBotoes() {
		return panelBotoes;
	}

	public void setPanelBotoes(JPanel panelBotoes) {
		this.panelBotoes = panelBotoes;
	}

	public CadastroC getCntCadastro() {
		return cntCadastro;
	}

	public void setCntCadastro(CadastroC cntCadastro) {
		this.cntCadastro = cntCadastro;
	}
}