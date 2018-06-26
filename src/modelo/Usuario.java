package modelo;

import java.io.Serializable;
import java.util.Date;

public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private Date dataDeNascimento;
	private String cpf;
	private String senha;

	public Usuario(String nome, Date dataDeNascimento, String cpf, String senha) {
		super();
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.cpf = cpf;
		this.senha = senha;
	}

	public Usuario() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
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
}
