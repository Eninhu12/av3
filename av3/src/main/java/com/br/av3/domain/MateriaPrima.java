package com.br.av3.domain;

public class MateriaPrima {
	private static long gerador = 0;
	private Long id;
	private String nome;
	private int estoque;
	public MateriaPrima(String nome, int estoque) {
		this.id = ++gerador;
		this.nome = nome;
		this.estoque =estoque;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public void alterar(String nome, int estoque) {
		this.nome = nome;
		this.estoque = estoque;
	}
}
