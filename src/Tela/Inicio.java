package Tela;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Inicio {
	
	private JFrame inicio;
	private JLabel bemvindo;
	private JButton comecar, comecarCadastrado, cadastrar, sair;
	private JPanel panelBotoes;
	
	public void Inicio(){
		inicio = new JFrame("O MELHOR JOGO DE FOCAR");
		inicio.setLayout(null);
		inicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		inicio.setSize(500,400);
		inicio.setLocationRelativeTo(null);
		inicio.setResizable(false);
		
		bemvindo = criaLabel();
		inicio.add(bemvindo);
		
		panelBotoes = criaBotoes();
		inicio.add(panelBotoes);
		
		inicio.setVisible(true);
		
	}
	
	public JLabel criaLabel(){
		JLabel label = new JLabel("Seja bem-vindo ao melhor jogo de forca!");
		
		label.setBounds(103, 10, 300, 20);
		
		return label;
	}
	
	public JPanel criaBotoes(){
		JPanel panel = new JPanel(null);
		
		panel.setBounds(100, 85, 300, 300);
		
		//adicionando botões
		comecarCadastrado = new JButton("Iniciar");
		comecarCadastrado.setBounds(45, 20, 200, 30);
		
		comecar = new JButton("Iniciar sem cadastro");
		comecar.setBounds(45, 70, 200, 30);
		
		cadastrar = new JButton("Cadastra-se");
		cadastrar.setBounds(45, 120, 200, 30);
		
		sair = new JButton("Sair");
		sair.setBounds(45, 170, 200, 30);
		
		panel.add(comecarCadastrado);
		panel.add(comecar);
		panel.add(cadastrar);
		panel.add(sair);
		

		
		return panel;
		
	}
	
	public void run(){
		Inicio();
	}
	
}

