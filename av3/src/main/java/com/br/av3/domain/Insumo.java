package com.br.av3.domain;

public class Insumo {
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

	public Insumo(MateriaPrima materia,Produto p,int quant) {
		this.id=gerador++;
		this.materia=materia;
		this.produto=p;
		this.quant=quant;
	}
	public void alterar(MateriaPrima materia,Produto p,int quant) {
		this.materia = materia;
		this.produto = p;
		this.quant=quant;
	}
}
