package com.br.av3.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.br.av3.model.InsumoModel;
import com.br.av3.services.InsumoService;
import com.br.av3.services.MateriaPrimaService;
import com.br.av3.services.ProdutoService;


public class InsumoController {
	@Autowired
	private InsumoService insumoService;
	@Autowired
	private MateriaPrimaService materiaPrimaService;
	@Autowired
	private ProdutoService produtoService;
	
	@PostMapping("/cadastrar")
	public InsumoModel cadastrar( @RequestBody InsumoModel model, BindingResult bindingResult,Long id) {
		if (bindingResult.hasErrors()) {
            throw new RuntimeException("Parametros inválidos");
        }
		if(id.equals(1)) {
			materiaPrimaService.alterar());
			produtoService.apagar(1);
		return new InsumoModel(insumoService.cadastrar(model));
		}
		else {
			return null;
		}
	}
}
