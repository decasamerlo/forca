package tela;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CadastroT {
	private JFrame telaCadastro;
	private JLabel boasVindas, labelNome, labelCPF, labelEmail, labelSenha, labelConfSenha;
	private JButton cadastrar, voltar;
	private JTextField nome, cpf, email, senha, confSenha;
	private JPanel panelBotoes;
	
	public void CadastroT(){
		telaCadastro = new JFrame("Cadastro");
		telaCadastro.setLayout(null);
		telaCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaCadastro.setSize(500,700);
		telaCadastro.setLocationRelativeTo(null);
		telaCadastro.setResizable(false);
		
		//boas vindas
		boasVindas = new JLabel("Faça seu cadastro =)");
		boasVindas.setBounds(180, 30, 800, 30);
		telaCadastro.add(boasVindas);
		
		//campo de entrada de informacoes
		nome = new JTextField();
		nome.setBounds(60, 100, 270, 30);
		telaCadastro.add(nome);
		
		cpf = new JTextField();
		cpf.setBounds(45, 150, 285, 30);
		telaCadastro.add(cpf);
		
		email = new JTextField();
		email.setBounds(62, 200, 268, 30);
		telaCadastro.add(email);
		
		senha = new JPasswordField();
		senha.setBounds(65, 250, 265, 30);
		telaCadastro.add(senha);
		
		confSenha = new JPasswordField();
		confSenha.setBounds(100, 300, 230, 30);
		telaCadastro.add(confSenha);
		
		//labels de informacoes
		labelNome = criaLabel("Nome: ");
		labelNome.setBounds(10,100,100,30);
		telaCadastro.add(labelNome);
		
		labelCPF = criaLabel("CPF: ");
		labelCPF.setBounds(10, 150, 100, 30);
		telaCadastro.add(labelCPF);
		
		labelEmail = criaLabel("E-mail: ");
		labelEmail.setBounds(10, 200, 100, 30);
		telaCadastro.add(labelEmail);
		
		labelSenha = criaLabel("Senha: ");
		labelSenha.setBounds(10, 250, 100, 30);
		telaCadastro.add(labelSenha);
		
		labelConfSenha = criaLabel("Conf.Senha: ");
		labelConfSenha.setBounds(10, 300,100,30);
		telaCadastro.add(labelConfSenha);
		
		panelBotoes = criaBotoes();
		telaCadastro.add(panelBotoes);
		
		telaCadastro.setVisible(true);
	}
	
	public JLabel criaLabel(String text){
		JLabel label = new JLabel(text);
		
		//label.setBounds(103, 10, 300, 20);
		
		return label;
	}
	
	public JPanel criaBotoes(){
		JPanel panel = new JPanel(null);
		
		panel.setBounds(100,85,300,300);
		
		//adicionando os botoes
		cadastrar = new JButton("Cadastre");
		cadastrar.setBounds(45, 250, 100, 30);
		
		voltar = new JButton("Voltar");
		voltar.setBounds(165, 250, 100, 30);
		
		panel.add(cadastrar);
		panel.add(voltar);
		
		return panel;
	}
	
	public void run(){
		CadastroT();
	}
	
}