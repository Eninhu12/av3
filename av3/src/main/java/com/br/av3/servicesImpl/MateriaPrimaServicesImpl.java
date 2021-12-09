package com.br.av3.servicesImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.br.av3.domain.MateriaPrima;
import com.br.av3.domain.Produto;
import com.br.av3.execeptions.NaoExisteException;
import com.br.av3.model.MateriaPrimaModel;
import com.br.av3.repositories.MateriaPrimaRepository;
import com.br.av3.services.MateriaPrimaService;

public class MateriaPrimaServicesImpl implements MateriaPrimaService {
	@Autowired
	private MateriaPrimaRepository materiaPrimaRepository;
	@Override
	public MateriaPrima cadastrar(MateriaPrimaModel model) {
		return materiaPrimaRepository.cadastrar(new MateriaPrima(model.getNome(), model.getEstoque()));
	}


	@Override
	public MateriaPrima apagar(Long id) {
		return this.materiaPrimaRepository.apagar(this.consultar(id));
	}

	@Override
	public List<MateriaPrima> listar() {
		return this.materiaPrimaRepository.listar();
	}

	@Override
	public MateriaPrima alterar(Long id, MateriaPrimaModel model) {
		MateriaPrima p = this.consultar(id);
		p.alterar(model.getNome(), model.getEstoque());
		return p;
	}
	@Override
	public MateriaPrima consultar(final Long id) {
		return this.materiaPrimaRepository.consultar(id)
				.orElseThrow(() -> new NaoExisteException(id));
	}


}
