package com.goodmann.uploadfile.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "compra")
public class Compra {
	private List<Double> valor;
}
