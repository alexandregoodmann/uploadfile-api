package com.goodmann.uploadfile.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "geracao")
public class Geracao {
	private List<Double> valor;
}
