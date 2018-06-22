package com.kazale.pontointeligente.api.services.Impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kazale.pontointeligente.api.entities.Funcionario;
import com.kazale.pontointeligente.api.repositories.FuncionarioRepository;
import com.kazale.pontointeligente.api.services.FuncionarioService;

@Service
public class FuncionarioServiceImpl implements FuncionarioService{

	private static final Logger log = LoggerFactory.getLogger(FuncionarioServiceImpl.class);
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@Override
	public Funcionario persirtir(Funcionario funcionario) {
		log.info("Persirtindo Funcionario {}",funcionario);
		return this.funcionarioRepository.save(funcionario);
	}

	@Override
	public Optional<Funcionario> buscarCpf(String cpf) {
		log.info("Buscando por CPF {}",cpf);
		return Optional.ofNullable(this.funcionarioRepository.findByCpf(cpf));
	}

	@Override
	public Optional<Funcionario> buscarPorEmail(String email) {
		log.info("Buscando por email {}",email);
		return Optional.ofNullable(this.funcionarioRepository.findByEmail(email));

	}

	@Override
	public Optional<Funcionario> buscarPorId(Long id) {
		log.info("Buscando por ID {}",id);
		return this.funcionarioRepository.findById(id);

	}

}
