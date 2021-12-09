package com.br.av3.repository.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.br.av3.domain.Insumo;
import com.br.av3.model.InsumoModel;
import com.br.av3.repositories.insumoRepository.InsumoRepository;


public class InsumoRepositoryImpl implements InsumoRepository{
	private final static List<Insumo> INSUMO = new ArrayList<Insumo>();
	@Override
	public List<Insumo> listar() {
		return INSUMO;
	}
	@Override
	public Insumo cadastrar(Insumo domain) {
		INSUMO.add(domain);
		return domain;
	}
	@Override
	public Insumo apagar(Insumo domain) {
		INSUMO.add(domain);
		return domain;
	}
	@Override
	public Optional<Insumo> consultar(Long id) {
		return INSUMO.stream().filter(p -> id.equals(p.getId())).findFirst();
	}
}
