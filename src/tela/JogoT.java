package tela;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controle.JogoC;

public class JogoT {

	private JogoC cntJogo;
	private JPanel telaJogo, panelForca, panelPalavra, panelDicas, panelBotoes, panelTeclado;
	private JLabel labelIcon, labelPalavra, labelDicas, labelDica1, labelDica2, labelDica3;
	private JButton buttonDica, buttonDesistir;
	private JTextField[] letras;
	private ImageIcon icon;
	
	public JogoT(JogoC cntJogo) {
		this.cntJogo = cntJogo;
	}
	

	public JPanel criaTela(String palavra, String dica1, String dica2, String dica3) {
		
		telaJogo = new JPanel();
		telaJogo.setLayout(null);
		telaJogo.setSize(700, 500);
		
		panelForca = criaPanelForca(0);
		telaJogo.add(panelForca);
		
		panelPalavra = criaPanelPalavra(palavra);
		telaJogo.add(panelPalavra);
		
		panelDicas = criaPanelDicas(dica1, dica2, dica3);
		telaJogo.add(panelDicas);
		
		panelBotoes = criaPanelBotoes();
		telaJogo.add(panelBotoes);
		
		panelTeclado = criaPanelTeclado();
		telaJogo.add(panelTeclado);
		
		return telaJogo;
	}

	private JPanel criaPanelForca(int valor) {
		JPanel panel = new JPanel(null);
		
		panel.setBounds(10, 10, 240, 240);
		panel.setBackground(Color.WHITE);
		
		icon = new ImageIcon("imagens/forca" + valor + ".png");
		labelIcon = new JLabel(icon);
		labelIcon.setBounds(0, 0, 240, 240);
		panel.add(labelIcon);
		
		return panel;
	}
	
	public void setPanelForca(int valor) {
		icon = new ImageIcon("imagens/forca" + valor + ".png");
		labelIcon.setIcon(icon);
	}
	
	public JPanel criaPanelPalavra(String palavra){
		JPanel panel = new JPanel(null);
		panel.setLayout(null);
		
		panel.setBounds(260, 10, 420, 80);
		panel.setBackground(Color.yellow);
		
		labelPalavra = new JLabel("A sua Palavra é: ");
		labelPalavra.setBounds(10, 10, 420, 10);
		panel.add(labelPalavra);
		
		int tamanhoPalavra = palavra.length();
		letras = new JTextField[tamanhoPalavra];
		
		//adicionando textfield		
		for(int i = 0; i < tamanhoPalavra; i++){
			letras[i] = new JTextField();
			letras[i].setHorizontalAlignment(JTextField.CENTER);
			letras[i].setFont(new Font("Arial", Font.BOLD, 25));
			letras[i].setText("");
			letras[i].setBounds(10 + 40*i, 30, 35, 35);
			letras[i].setEditable(false);
			panel.add(letras[i]);
		}
		
		return panel;
	}

	private JPanel criaPanelDicas(String dica1, String dica2, String dica3) {
		JPanel panel = new JPanel(null);
		
		panel.setBounds(260, 100, 420, 90);
		panel.setBackground(Color.green);
		
		labelDicas = new JLabel("Dicas: ");
		labelDicas.setBounds(5, 5, 420, 10);
		panel.add(labelDicas);
		
		labelDica1 = new JLabel(dica1);
		labelDica1.setBounds(5, 25, 420, 10);
		labelDica1.setVisible(false);
		panel.add(labelDica1);
		
		labelDica2 = new JLabel(dica2);
		labelDica2.setBounds(5, 45, 420, 10);
		labelDica2.setVisible(false);
		panel.add(labelDica2);
		
		labelDica3 = new JLabel(dica3);
		labelDica3.setBounds(5, 65, 420, 10);
		labelDica3.setVisible(false);
		panel.add(labelDica3);
		
		return panel;
	}
	
	private JPanel criaPanelBotoes() {
		JPanel panel = new JPanel(null);
		
		panel.setBounds(260, 200, 420, 50);
		panel.setBackground(Color.blue);
		
		buttonDica = new JButton("Dica");
		buttonDica.setBounds(110, 10, 100, 30);
		buttonDica.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cntJogo.pedirDica();
			}
		});
		panel.add(buttonDica);
		
		buttonDesistir = new JButton("Desistir");
		buttonDesistir.setBounds(220, 10, 100, 30);
		buttonDesistir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cntJogo.desistir();
			}
		});
		panel.add(buttonDesistir);
		
		return panel;
	}
	
	private JPanel criaPanelTeclado() {
		JPanel panel = new JPanel(null);
		
		panel.setBounds(10, 260, 670, 200);
		panel.setBackground(Color.black);
		
		JButton tecla = null;
		
		tecla = new JButton("Q");
		panel.add(tecla);
		
		tecla = new JButton("W");
		panel.add(tecla);
		
		tecla = new JButton("E");
		panel.add(tecla);
		
		tecla = new JButton("R");
		panel.add(tecla);
		
		tecla = new JButton("T");
		panel.add(tecla);
		
		tecla = new JButton("Y");
		panel.add(tecla);
		
		tecla = new JButton("U");
		panel.add(tecla);
		
		tecla = new JButton("I");
		panel.add(tecla);
		
		tecla = new JButton("O");
		panel.add(tecla);
		
		tecla = new JButton("P");
		panel.add(tecla);
		
		tecla = new JButton("A");
		panel.add(tecla);
		
		tecla = new JButton("S");
		panel.add(tecla);
		
		tecla = new JButton("D");
		panel.add(tecla);
		
		tecla = new JButton("F");
		panel.add(tecla);
		
		tecla = new JButton("G");
		panel.add(tecla);
		
		tecla = new JButton("H");
		panel.add(tecla);
		
		tecla = new JButton("J");
		panel.add(tecla);
		
		tecla = new JButton("K");
		panel.add(tecla);
		
		tecla = new JButton("L");
		panel.add(tecla);
		
		tecla = new JButton("Ç");
		panel.add(tecla);
		
		tecla = new JButton("Z");
		panel.add(tecla);
		
		tecla = new JButton("X");
		panel.add(tecla);
		
		tecla = new JButton("C");
		panel.add(tecla);
		
		tecla = new JButton("V");
		panel.add(tecla);
		
		tecla = new JButton("B");
		panel.add(tecla);
		
		tecla = new JButton("N");
		panel.add(tecla);
		
		tecla = new JButton("M");
		panel.add(tecla);
		
		Component[] componentes = panel.getComponents();
		for (int i = 0; i < componentes.length; i++) {
			if (i <= 9) {
				componentes[i].setBounds(40 + 60*i, 15, 50, 50);
			} else if (i <= 19) {
				componentes[i].setBounds(40 + 60*(i-10), 75, 50, 50);
			} else {
				componentes[i].setBounds(130 + 60*(i-20), 135, 50, 50);
			}
			
			JButton button = (JButton) componentes[i];
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					cntJogo.teclaApertada(button);
				}
			});
			
		}
		
		return panel;
	}

	public JogoC getCntJogo() {
		return cntJogo;
	}

	public void setCntJogo(JogoC cntJogo) {
		this.cntJogo = cntJogo;
	}

	public JPanel getTelaJogo() {
		return telaJogo;
	}

	public void setTelaJogo(JPanel telaJogo) {
		this.telaJogo = telaJogo;
	}

	public JPanel getPanelForca() {
		return panelForca;
	}

	public void setPanelForca(JPanel panelForca) {
		this.panelForca = panelForca;
	}

	public JPanel getPanelPalavra() {
		return panelPalavra;
	}

	public void setPanelPalavra(JPanel panelPalavra) {
		this.panelPalavra = panelPalavra;
	}

	public JPanel getPanelDicas() {
		return panelDicas;
	}

	public void setPanelDicas(JPanel panelDicas) {
		this.panelDicas = panelDicas;
	}

	public JPanel getPanelBotoes() {
		return panelBotoes;
	}

	public void setPanelBotoes(JPanel panelBotoes) {
		this.panelBotoes = panelBotoes;
	}

	public JPanel getPanelTeclado() {
		return panelTeclado;
	}


	public void setPanelTeclado(JPanel panelTeclado) {
		this.panelTeclado = panelTeclado;
	}


	public JLabel getLabelPalavra() {
		return labelPalavra;
	}


	public void setLabelPalavra(JLabel labelPalavra) {
		this.labelPalavra = labelPalavra;
	}
	
	public JLabel getLabelDicas() {
		return labelDicas;
	}

	public void setLabelDicas(JLabel labelDicas) {
		this.labelDicas = labelDicas;
	}

	public JLabel getLabelDica1() {
		return labelDica1;
	}

	public void setLabelDica1(JLabel labelDica1) {
		this.labelDica1 = labelDica1;
	}

	public JLabel getLabelDica2() {
		return labelDica2;
	}

	public void setLabelDica2(JLabel labelDica2) {
		this.labelDica2 = labelDica2;
	}

	public JLabel getLabelDica3() {
		return labelDica3;
	}

	public void setLabelDica3(JLabel labelDica3) {
		this.labelDica3 = labelDica3;
	}
	
	public JButton getButtonDica() {
		return buttonDica;
	}

	public void setButtonDica(JButton buttonDica) {
		this.buttonDica = buttonDica;
	}

	public JButton getButtonDesistir() {
		return buttonDesistir;
	}

	public void setButtonDesistir(JButton buttonDesistir) {
		this.buttonDesistir = buttonDesistir;
	}

	public JTextField[] getLetras() {
		return letras;
	}

	public void setLetras(JTextField[] a) {
		this.letras = a;
	}
	
}
