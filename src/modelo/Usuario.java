package modelo;

import java.io.Serializable;

public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String cpf;
	private String senha;
	private int pontos;

	public Usuario(String nome, String cpf, String senha, int pontos) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		this.pontos = pontos;
	}

	public Usuario() {
		this.pontos=0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	

}


