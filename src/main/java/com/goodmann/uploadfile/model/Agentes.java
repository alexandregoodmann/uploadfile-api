package com.goodmann.uploadfile.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "agentes")
public class Agentes {

	@Id
	private String id;
	private List<Agente> agente;
	private String versao;
}
