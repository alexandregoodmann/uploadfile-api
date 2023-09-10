package com.goodmann.uploadfile.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goodmann.uploadfile.model.Agente;
import com.goodmann.uploadfile.model.Agentes;
import com.goodmann.uploadfile.model.RegiaoEnum;
import com.goodmann.uploadfile.repository.AgenteRepository;

@Service
public class UploadService {

	Logger logger = LoggerFactory.getLogger(UploadService.class);

	@Autowired
	private AgenteRepository agenteRepository;

	public List<Integer> saveAgentes(Agentes agentes) {
		List<Integer> codigos = agentes.getAgente().stream().map(map -> map.getCodigo()).collect(Collectors.toList());
		logger.info("Following Agents will be added: " + Arrays.toString(codigos.toArray()));
		this.agenteRepository.saveAll(agentes.getAgente());
		return codigos;
	}

	public List<Agente> findRegiao(RegiaoEnum sigla) {
		List<Agente> agentes = this.agenteRepository.findBySigla(sigla);
		agentes.stream().forEach(agente -> {
			agente.setRegiao(
					agente.getRegiao().stream().filter(o -> o.getSigla().equals(sigla)).collect(Collectors.toList()));
		});
		return agentes;
	}
}
