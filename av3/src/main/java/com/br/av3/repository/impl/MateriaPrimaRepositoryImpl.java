package com.br.av3.repository.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.br.av3.domain.MateriaPrima;
import com.br.av3.model.MateriaPrimaModel;
import com.br.av3.repositories.MateriaPrimaRepository;


public class MateriaPrimaRepositoryImpl implements MateriaPrimaRepository{

	private final static List<MateriaPrima> MATERIA = new ArrayList<MateriaPrima>();
	
	@Override
	public MateriaPrima cadastrar(MateriaPrima domain) {
		MATERIA.add(domain);
		return domain;
	}

	@Override
	public MateriaPrima apagar(MateriaPrima domain) {
		MATERIA.remove(domain);
		return domain;
	}

	@Override
	public List<MateriaPrima> listar() {
		return MATERIA;
	}

	@Override
	public  Optional<MateriaPrima> consultar(final Long id) {
		return MATERIA.stream().filter(p -> id.equals(p.getId())).findFirst();
	}

}
