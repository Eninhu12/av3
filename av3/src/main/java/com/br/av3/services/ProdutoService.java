package com.br.av3.services;

import java.util.List;


import com.br.av3.domain.Produto;
import com.br.av3.model.ProdutoModel;

public interface ProdutoService {
	Produto cadastrar(ProdutoModel  model);
	Produto alterar(Long id, ProdutoModel model);
	Produto apagar(Long id);
	List<Produto> listar();
	Produto consultar(Long id);
}
