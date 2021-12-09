package com.br.av3.model;

import com.br.av3.domain.Insumo;
import com.br.av3.domain.MateriaPrima;
import com.br.av3.domain.Produto;

public class InsumoModel {
	private static long gerador = 0;
	private Long id;
	public static long getGerador() {
		return gerador;
	}

	public Long getId() {
		return id;
	}

	public MateriaPrima getMateria() {
		return materia;
	}

	public Produto getProduto() {
		return produto;
	}

	private MateriaPrima materia;
	private Produto produto;
	private int quant;
	
	public int getQuant() {
		return quant;
	}

	public InsumoModel(final Insumo domain) {
		this.materia=getMateria();
		this.produto=getProduto();
		this.quant=getQuant();
	}
}
