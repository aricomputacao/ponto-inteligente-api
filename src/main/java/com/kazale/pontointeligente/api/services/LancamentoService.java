package com.kazale.pontointeligente.api.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.kazale.pontointeligente.api.entities.Lancamento;

public interface LancamentoService {

	/**
	 * Retorna Lançamentos pelo ID do Funcionario paginado
	 * 
	 * @param funcionarioId
	 * @param page
	 * @return
	 */
	Page<Lancamento> buscarFuncionarioPorId(Long funcionarioId,PageRequest page);
	
	/**
	 * Retorna um lançamento por ID
	 * 
	 * @param id
	 * @return
	 */
	Optional<Lancamento> buscarPorId(Long id);
	
	/**
	 * Persisti um lançamento do banco de dados.
	 * 
	 * @param lancamento
	 * @return
	 */
	Lancamento persistir(Lancamento lancamento);
	
	/**
	 * Remove um lançamento do Bando de Dados
	 * 
	 * @param id
	 */
	void remover(Long id);
}
