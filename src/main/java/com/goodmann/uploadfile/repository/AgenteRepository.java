package com.goodmann.uploadfile.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.goodmann.uploadfile.model.Agente;
import com.goodmann.uploadfile.model.RegiaoEnum;

public interface AgenteRepository extends MongoRepository<Agente, String> {

	@Query("{'regiao.sigla': '?0'}")
	List<Agente> findBySigla(RegiaoEnum sigla);
}
