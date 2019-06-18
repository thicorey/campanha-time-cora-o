package model;

import java.util.List;

public class Usuario {
	
	private long id;
	private String nome;
	private String userId;
	private String password;
	private String email;
	private String timeCoracao;

	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String gettimeCoracao() {
		return timeCoracao;
	}
	public void setTimeCoracao(String timeCoracao) {
		this.timeCoracao = timeCoracao;
	}

}
