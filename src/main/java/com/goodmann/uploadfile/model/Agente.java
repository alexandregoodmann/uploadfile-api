package com.goodmann.uploadfile.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "agente")
public class Agente {
	private Integer codigo;
	private Date data;
	private List<Regiao> regiao;
}
