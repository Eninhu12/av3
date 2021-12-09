package com.br.av3.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.br.av3.domain.Produto;
import com.br.av3.execeptions.NaoExisteException;
import com.br.av3.model.ProdutoModel;
import com.br.av3.repositories.ProdutoRepository;
import com.br.av3.services.ProdutoService;



public class ProdutoServiceImpl implements ProdutoService {
	@Autowired
	private  ProdutoRepository produtoRepository;
	@Override
	public Produto cadastrar(ProdutoModel model) {
		return produtoRepository.cadastrar(new  Produto(model.getNome(), model.getValor()));
	}

	@Override
	public Produto apagar(Long id) {
		return this.produtoRepository.apagar(this.consultar(id));
	}

	@Override
	public List<Produto> listar() {
		return this.produtoRepository.listar();
		}
	
	@Override
	public Produto alterar(Long id, ProdutoModel model) {
		Produto p = this.consultar(id);
		p.alterar(model.getNome(), model.getValor());
		return p;
	}
	@Override
	public Produto consultar(final Long id) {
		return this.produtoRepository.consultar(id)
				.orElseThrow(() -> new NaoExisteException(id));
	}
}
