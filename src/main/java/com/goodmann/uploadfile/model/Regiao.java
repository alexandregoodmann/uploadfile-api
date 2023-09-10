package com.goodmann.uploadfile.model;

import lombok.Data;

@Data
public class Regiao {
	private Geracao geracao;
	private Compra compra;
	private PrecoMedio precoMedio;
	private RegiaoEnum sigla;
}
