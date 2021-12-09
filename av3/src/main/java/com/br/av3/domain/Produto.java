package com.br.av3.domain;

import java.math.BigDecimal;

public class Produto {
	private static long gerador = 0;
	private Long id;
	private String nome;
	private BigDecimal valor;
	public Produto(String nome, BigDecimal valor) {
		this.id = ++gerador;
		this.nome = nome;
		this.valor = valor;
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
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public void alterar(String nome, BigDecimal valor) {
		this.nome = nome;
		this.valor = valor;
	}
}
