package Tela;

import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {

	private JFrame telaLogin;
	private JLabel labelLogin,labelSenha; 
	private JButton logar, voltar;
	private JTextField cpf, senha;
	private JPanel panelBotoes;
	
	public void Login() {
		telaLogin = new JFrame ("LOGIN");
		telaLogin.setLayout(null);
		telaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaLogin.setSize(500, 400);
		telaLogin.setLocationRelativeTo(null);
		telaLogin.setResizable(false);
		
		//campo de texto
		cpf = new JTextField();
		cpf.setBounds(250, 90, 150, 30);
		telaLogin.add(cpf);
		
		//campo de senha
		senha = new JPasswordField();
		senha.setBounds(250, 140, 150, 30);
		telaLogin.add(senha);
		
		//login com cpf
		labelLogin = criaLabel("Digite seu CPF: ");
		labelLogin.setBounds(100, 90, 150, 30);
		telaLogin.add(labelLogin);
		
		//login com senha
		labelSenha = criaLabel("Digite sua Senha: ");
		labelSenha.setBounds(100, 140, 150, 30);
		telaLogin.add(labelSenha);
		
		//painel dos botoes
		panelBotoes = criaBotoes();
		telaLogin.add(panelBotoes);
		
		telaLogin.setVisible(true);
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
		logar = new JButton("Logar");
		logar.setBounds(45, 150, 100, 30);
		
		voltar = new JButton("Voltar");
		voltar.setBounds(165, 150, 100, 30);
		
		panel.add(logar);
		panel.add(voltar);
		
		return panel;
	}
	
	public void run(){
		Login();
	}
}

