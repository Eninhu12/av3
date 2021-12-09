package com.br.av3.services;

import java.util.List;

import com.br.av3.domain.MateriaPrima;
import com.br.av3.model.MateriaPrimaModel;



public interface MateriaPrimaService {
	MateriaPrima cadastrar(MateriaPrimaModel model);
	MateriaPrima alterar(Long id, MateriaPrimaModel model);
	MateriaPrima apagar(Long id);
	List<MateriaPrima> listar();
	MateriaPrima consultar(Long id);
}
