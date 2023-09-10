package com.goodmann.uploadfile.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "agente")
public class Agente {

	@Id
	private String id;
	private Integer codigo;
	private Date data;
	private List<Regiao> regiao;
}
