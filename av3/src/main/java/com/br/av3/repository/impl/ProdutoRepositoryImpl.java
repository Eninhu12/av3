package com.br.av3.repository.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.br.av3.domain.Produto;
import com.br.av3.repositories.ProdutoRepository;

public class ProdutoRepositoryImpl implements ProdutoRepository {
	private final static List<Produto> PRODUTO = new ArrayList<Produto>();

	@Override
	public Produto cadastrar(Produto domain) {
		PRODUTO.add(domain);
		return domain;
	}

	@Override
	public Produto apagar(Produto domain) {
		PRODUTO.remove(domain);
		return domain;
	}

	@Override
	public List<Produto> listar() {
		return PRODUTO;
	}

	@Override
		public Optional<Produto> consultar(final Long id) {
			return PRODUTO.stream().filter(p -> id.equals(p.getId())).findFirst();
		}
	}

