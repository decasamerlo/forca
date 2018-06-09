package tela;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controle.InicioC;

public class InicioT {
	
	InicioC cntInicio;
	
	private JPanel inicio;
	private JLabel bemvindo;
	private JButton comecar, comecarCadastrado, cadastrar, sair;
	private JPanel panelBotoes;
	
	public InicioT(InicioC cntInicio) {
		
		this.cntInicio = cntInicio;
		inicio = new JPanel(null);
		
		bemvindo = criaLabel();
		inicio.add(bemvindo);
		
		panelBotoes = criaBotoes();
		inicio.add(panelBotoes);
		
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
		sair.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				cntInicio.sair();
			}
		});
		
		panel.add(comecarCadastrado);
		panel.add(comecar);
		panel.add(cadastrar);
		panel.add(sair);
		
		return panel;
		
	}
	
	public JPanel criaTela() {
		return inicio;
	}
}

