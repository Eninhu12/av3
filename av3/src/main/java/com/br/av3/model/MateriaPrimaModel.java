package com.br.av3.model;

import com.br.av3.domain.MateriaPrima;

public class MateriaPrimaModel {
	private Long id;
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public int getEstoque() {
		return estoque;
	}
	private String nome;
	private int estoque;
	public MateriaPrimaModel(final MateriaPrima domain) {
		this.id = domain.getId();
		this.nome = domain.getNome();
		this.estoque = domain.getEstoque();
		
	}
	
}
