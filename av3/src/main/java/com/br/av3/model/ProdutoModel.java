package com.br.av3.model;

import java.math.BigDecimal;

import com.br.av3.domain.Produto;

public class ProdutoModel {
	private Long id;
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public BigDecimal getValor() {
		return valor;
	}
	private String nome;
	private BigDecimal valor;
	public ProdutoModel(final Produto domain) {
		this.id = domain.getId();
		this.nome = domain.getNome();
		this.valor= domain.getValor();
		
	}
}
