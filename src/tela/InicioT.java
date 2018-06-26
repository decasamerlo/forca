package tela;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controle.InicioC;

public class InicioT {
	
	InicioC cntInicio;
	
	private JPanel tela;
	private JLabel bemvindo;
	private JButton iniciar, iniciarCadastrado, cadastrar, sair;
	private JPanel panelBotoes;
	
	public InicioT(InicioC cntInicio) {
		
		this.cntInicio = cntInicio;
		tela = new JPanel(null);
		
		bemvindo = criaLabel();
		tela.add(bemvindo);
		
		panelBotoes = criaBotoes();
		tela.add(panelBotoes);
		
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
		iniciarCadastrado = new JButton("Iniciar");
		iniciarCadastrado.setBounds(45, 20, 200, 30);
		iniciarCadastrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cntInicio.iniciarCadastrado();
			}
		});
		
		iniciar = new JButton("Iniciar sem cadastro");
		iniciar.setBounds(45, 70, 200, 30);
		iniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cntInicio.iniciar();
			}
		});
		
		cadastrar = new JButton("Cadastra-se");
		cadastrar.setBounds(45, 120, 200, 30);
		cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cntInicio.cadastrar();
			}
		});
		
		sair = new JButton("Sair");
		sair.setBounds(45, 170, 200, 30);
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cntInicio.sair();
			}
		});
		
		panel.add(iniciarCadastrado);
		panel.add(iniciar);
		panel.add(cadastrar);
		panel.add(sair);
		
		return panel;
		
	}
	
	public JPanel criaTela() {
		return tela;
	}
}

