package tela;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controle.InicioC;

public class InicioT {
	
	InicioC cntInicio;
	
	private JPanel telaInicio;
	private JLabel bemVindo;
	private JButton iniciar, iniciarCadastrado, cadastrar, sair;
	private JPanel panelBotoes;
	
	public InicioT(InicioC cntInicio) {
		this.cntInicio = cntInicio;
	}
	
	public JPanel criaBotoes(){
		JPanel panel = new JPanel(null);
		
		panel.setBounds(100, 80, 300, 300);
		
		//adicionando botões
		iniciarCadastrado = new JButton("Login");
		iniciarCadastrado.setBounds(45, 20, 200, 30);
		iniciarCadastrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cntInicio.login();
			}
		});
		
		iniciar = new JButton("Iniciar sem cadastro");
		iniciar.setBounds(45, 70, 200, 30);
		iniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cntInicio.iniciarSemCadastro();
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
		telaInicio = new JPanel();
		telaInicio.setLayout(null);
		telaInicio.setSize(500, 400);
		
		bemVindo = new JLabel("Seja bem-vindo ao melhor jogo de forca!");
		bemVindo.setBounds(130, 30, 300, 30);
		telaInicio.add(bemVindo);
		
		panelBotoes = criaBotoes();
		telaInicio.add(panelBotoes);
		
		return telaInicio;
	}

	public InicioC getCntInicio() {
		return cntInicio;
	}

	public void setCntInicio(InicioC cntInicio) {
		this.cntInicio = cntInicio;
	}

	public JPanel getTelaInicio() {
		return telaInicio;
	}

	public void setTelaInicio(JPanel telaInicio) {
		this.telaInicio = telaInicio;
	}

	public JLabel getBemvindo() {
		return bemVindo;
	}

	public void setBemvindo(JLabel bemvindo) {
		this.bemVindo = bemvindo;
	}

	public JButton getIniciar() {
		return iniciar;
	}

	public void setIniciar(JButton iniciar) {
		this.iniciar = iniciar;
	}

	public JButton getIniciarCadastrado() {
		return iniciarCadastrado;
	}

	public void setIniciarCadastrado(JButton iniciarCadastrado) {
		this.iniciarCadastrado = iniciarCadastrado;
	}

	public JButton getCadastrar() {
		return cadastrar;
	}

	public void setCadastrar(JButton cadastrar) {
		this.cadastrar = cadastrar;
	}

	public JButton getSair() {
		return sair;
	}

	public void setSair(JButton sair) {
		this.sair = sair;
	}

	public JPanel getPanelBotoes() {
		return panelBotoes;
	}

	public void setPanelBotoes(JPanel panelBotoes) {
		this.panelBotoes = panelBotoes;
	}
	
}

