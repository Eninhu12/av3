package com.br.av3.repositories;

import java.util.List;
import java.util.Optional;

import com.br.av3.domain.Produto;
import com.br.av3.model.ProdutoModel;


public interface ProdutoRepository {
	Produto cadastrar(Produto domain);
	Produto apagar(Produto model);
	List<Produto> listar();
	Optional<Produto> consultar(Long id);
}
