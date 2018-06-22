package com.kazale.pontointeligente.api.services;

import java.util.Optional;

import com.kazale.pontointeligente.api.entities.Funcionario;

public interface FuncionarioService {

	/**
	 * Persiste um funcionario na base de dados
	 * 
	 * @param funcionario
	 * @return
	 */
	Funcionario persirtir(Funcionario funcionario);
	
	/**
	 * Retorna um funcionario por cpf
	 * 
	 * @param string
	 * @return
	 */
	Optional<Funcionario> buscarCpf(String cpf);
	
	/**
	 * Retorna um funcionario por email
	 * 
	 * @param email
	 * @return
	 */
	Optional<Funcionario> buscarPorEmail(String email);

	
	/**
	 * 
	 * Retorna funcionario por ID
	 * @param id
	 * @return
	 */
	Optional<Funcionario> buscarPorId(Long id);

	

}
