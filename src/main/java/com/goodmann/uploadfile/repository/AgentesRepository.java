package com.goodmann.uploadfile.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.goodmann.uploadfile.model.Agentes;
import com.goodmann.uploadfile.model.RegiaoEnum;

public interface AgentesRepository extends MongoRepository<Agentes, String> {

	@Query("{'agente.regiao.sigla': '?0'}")
	List<Agentes> findBySigla(RegiaoEnum sigla);
}
