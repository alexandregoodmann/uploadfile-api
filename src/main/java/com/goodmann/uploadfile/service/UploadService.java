package com.goodmann.uploadfile.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goodmann.uploadfile.model.Agentes;
import com.goodmann.uploadfile.model.RegiaoEnum;
import com.goodmann.uploadfile.repository.AgentesRepository;

@Service
public class UploadService {

	Logger logger = LoggerFactory.getLogger(UploadService.class);

	@Autowired
	private AgentesRepository agentesRepository;

	public List<Integer> saveAgentes(Agentes agentes) {
		List<Integer> codigos = agentes.getAgente().stream().map(map -> map.getCodigo()).collect(Collectors.toList());
		logger.info("Following Agents will be added: " + Arrays.toString(codigos.toArray()));
		this.agentesRepository.save(agentes);
		return codigos;
	}

	public List<Agentes> findRegiao(RegiaoEnum sigla) {
		return this.agentesRepository.findBySigla(sigla);
	}
}
