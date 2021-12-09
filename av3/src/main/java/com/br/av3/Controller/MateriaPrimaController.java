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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.av3.model.MateriaPrimaModel;
import com.br.av3.services.MateriaPrimaService;

@RestController
@RequestMapping("/materia-prima")
public class MateriaPrimaController {

		@Autowired
		private MateriaPrimaService materiaPrimaService;
		
		@PostMapping("/cadastrar")
		public MateriaPrimaModel cadastrar( @RequestBody MateriaPrimaModel model, BindingResult bindingResult) {
			if (bindingResult.hasErrors()) {
	            throw new RuntimeException("Parametros inválidos");
	        }
			return new MateriaPrimaModel(materiaPrimaService.cadastrar(model));
		}
		
		@PutMapping("/alterar/{id}")
		public MateriaPrimaModel alterar(@PathVariable Long id, @RequestBody MateriaPrimaModel model, BindingResult bindingResult) {
			if (bindingResult.hasErrors()) {
	            throw new RuntimeException("Parametros inválidos");
	        }
			return new MateriaPrimaModel(materiaPrimaService.alterar(id, model));
		}
		
		@DeleteMapping("/apagar/{id}")
		public MateriaPrimaModel apagar(@PathVariable Long id) {
			return new MateriaPrimaModel(materiaPrimaService.apagar(id));
		}
		
		@GetMapping("/listar")
		public List<MateriaPrimaModel> listar() {
			return materiaPrimaService.listar().stream().map(MateriaPrimaModel::new).collect(Collectors.toList());
		}
	}

