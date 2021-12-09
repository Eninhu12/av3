package com.br.av3.repositories;

import java.util.List;
import java.util.Optional;

import com.br.av3.domain.MateriaPrima;
import com.br.av3.model.MateriaPrimaModel;

public interface MateriaPrimaRepository {
	MateriaPrima cadastrar(MateriaPrima domain);
	MateriaPrima apagar(MateriaPrima materiaPrima);
	List<MateriaPrima> listar();
	Optional<MateriaPrima> consultar(Long id);

}
