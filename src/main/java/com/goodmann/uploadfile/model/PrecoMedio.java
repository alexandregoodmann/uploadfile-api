package com.goodmann.uploadfile.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "precomedio")
public class PrecoMedio {
	private List<Double> valor;
}
