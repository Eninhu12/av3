package com.br.av3.Controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.br.av3.model.ProdutoModel;
import com.br.av3.services.ProdutoService;

public class ProdutoController {
	@Autowired
	private ProdutoService produtoService;
	
	@PostMapping("/cadastrar")
	public ProdutoModel cadastrar( @RequestBody ProdutoModel model, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
            throw new RuntimeException("Parametros inválidos");
        }
		return new ProdutoModel(produtoService.cadastrar(model));
	}
	
	@PutMapping("/alterar/{id}")
	public ProdutoModel alterar(@PathVariable Long id, @RequestBody ProdutoModel model, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
            throw new RuntimeException("Parametros inválidos");
        }
		return new ProdutoModel(produtoService.alterar(id, model));
	}
	
	@DeleteMapping("/apagar/{id}")
	public ProdutoModel apagar(@PathVariable Long id) {
		return new ProdutoModel(produtoService.apagar(id));
	}
	
	@GetMapping("/listar")
	public List<ProdutoModel> listar() {
		return produtoService.listar().stream().map(ProdutoModel::new).collect(Collectors.toList());
	}
}

