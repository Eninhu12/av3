package com.br.av3.services;

import java.util.List;

import com.br.av3.domain.Insumo;
import com.br.av3.model.InsumoModel;



public interface InsumoService {
	Insumo cadastrar(InsumoModel model);
	List<Insumo> listar();
	Insumo consultar(Long id);
	Insumo apagar(Long id);
	Insumo alterar(Long id, InsumoModel model,int quant);
}