package com.br.av3.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.br.av3.domain.Insumo;
import com.br.av3.domain.Produto;
import com.br.av3.execeptions.NaoExisteException;
import com.br.av3.model.InsumoModel;
import com.br.av3.repositories.insumoRepository.InsumoRepository;
import com.br.av3.services.InsumoService;

public class InsumoServiceImpl implements InsumoService{
	@Autowired
	private InsumoRepository insumoRepository;
	@Override
	public List<Insumo> listar() {
		return this.insumoRepository.listar();
	}
	@Override
	public Insumo cadastrar(InsumoModel model) {
		return insumoRepository.cadastrar(new Insumo(model.getMateria(), model.getProduto(),model.getQuant()));
	}
	@Override
	public Insumo apagar(Long id) {
		return this.insumoRepository.apagar(this.consultar(id));
	}
	@Override
	public Insumo consultar(final Long id) {
		return this.insumoRepository.consultar(id)
				.orElseThrow(() -> new NaoExisteException(id));
	}
	@Override
	public Insumo alterar(Long id, InsumoModel model,int quant) {
		Insumo p = this.consultar(id);
		p.alterar(model.getMateria(), model.getProduto(),model.getQuant());
		return p;
	}
}
