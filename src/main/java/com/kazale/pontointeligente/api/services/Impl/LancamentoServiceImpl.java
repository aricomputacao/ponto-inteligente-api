package com.kazale.pontointeligente.api.services.Impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.kazale.pontointeligente.api.entities.Lancamento;
import com.kazale.pontointeligente.api.repositories.LancamentoRepository;
import com.kazale.pontointeligente.api.services.LancamentoService;

@Service
public class LancamentoServiceImpl implements LancamentoService {

	private static final Logger log = LoggerFactory.getLogger(LancamentoServiceImpl.class);

	@Autowired
	private LancamentoRepository lancamentoRepository;

	@Override
	public Page<Lancamento> buscarFuncionarioPorId(Long funcionarioId, PageRequest page) {
		log.info("Buscando por ID {}", funcionarioId);
		return this.lancamentoRepository.findByFuncionarioId(funcionarioId, page);

	}

	@Override
	public Optional<Lancamento> buscarPorId(Long id) {
		log.info("Buscando por ID {}", id);
		return this.lancamentoRepository.findById(id);

	}

	@Override
	public Lancamento persistir(Lancamento lancamento) {
		log.info("Pesistindo Lançamento {}", lancamento);
		return this.lancamentoRepository.save(lancamento);
	}

	@Override
	public void remover(Long id) {
		log.info("Removendo Lançamento {}", id);
		this.lancamentoRepository.deleteById(id);

	}

}
