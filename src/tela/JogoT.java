package tela;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controle.JogoC;

public class JogoT {

	private static final int borda = 10;
	JPanel telaJogo;
	JPanel telaPalavra;
	JPanel telaForca;
	JPanel teclado;
	JogoC cntJogo;

	public JogoT(JogoC cntJogo) {
		this.cntJogo = cntJogo;
		
		telaJogo = new JPanel(null);
		telaPalavra = criaTelaPalavra();
		telaForca = criaTelaForca();
		teclado = criaTeclado();
		
		telaJogo.add(telaPalavra);
		telaJogo.add(telaForca);
		telaJogo.add(teclado);

	}


	private JPanel criaTelaPalavra() {
		JPanel panel = new JPanel(null);
		panel.setBounds(borda, borda, telaJogo.getWidth()-borda, borda);
		panel.setBackground(Color.black);
		return panel;
	}

	private JPanel criaTelaForca() {
		JPanel panel = new JPanel(null);
		panel.setBounds(borda, telaPalavra.getHeight()+borda, telaJogo.getWidth()-borda, borda);
		panel.setBackground(Color.blue);
		return panel;
	}

	private JPanel criaTeclado() {
		JPanel panel = new JPanel(null);
		panel.setBounds(borda, telaForca.getY() + telaForca.getHeight()
				 + borda, telaJogo.getWidth() - borda * 3, borda * 30);
		panel.setBackground(Color.YELLOW);
		return panel;
	}

	public JPanel getTelaJogo() {
		return telaJogo;
	}

	public void setTelaJogo(JPanel telaJogo) {
		this.telaJogo = telaJogo;
	}

	public JPanel getTelaForca() {
		return telaForca;
	}

	public void setTelaForca(JPanel telaForca) {
		this.telaForca = telaForca;
	}

	public JPanel getTeclado() {
		return teclado;
	}

	public void setTeclado(JPanel teclado) {
		this.teclado = teclado;
	}
	
	public JPanel criaTela() {
		return telaJogo;
	}

}
