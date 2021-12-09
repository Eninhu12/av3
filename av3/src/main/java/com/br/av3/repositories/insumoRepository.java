package com.br.av3.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import com.br.av3.domain.Insumo;
import com.br.av3.model.InsumoModel;


public interface insumoRepository {
	@Repository
	public interface InsumoRepository {
		List<Insumo> listar();
		Insumo cadastrar(Insumo domain);
		Insumo apagar(Insumo materiaPrima);
		Optional<Insumo> consultar(Long id);
	}
}
