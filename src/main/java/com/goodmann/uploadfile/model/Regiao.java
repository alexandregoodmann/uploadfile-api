package com.goodmann.uploadfile.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "regiao")
public class Regiao {
	private Geracao geracao;
	private Compra compra;
	private PrecoMedio precoMedio;
	private RegiaoEnum sigla;
}
