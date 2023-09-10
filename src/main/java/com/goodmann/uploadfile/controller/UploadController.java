package com.goodmann.uploadfile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goodmann.uploadfile.model.Agente;
import com.goodmann.uploadfile.model.Agentes;
import com.goodmann.uploadfile.model.RegiaoEnum;
import com.goodmann.uploadfile.service.UploadService;

@CrossOrigin
@RestController
@RequestMapping(value = "v1/upload")
public class UploadController {

	@Autowired
	private UploadService uploadService;

	@PostMapping
	public List<Integer> upload(@RequestBody Agentes model) {
		return this.uploadService.saveAgentes(model);
	}

	@GetMapping("/regiao/{sigla}")
	public List<Agente> findRegiao(@PathVariable(required = true, name = "sigla") RegiaoEnum sigla) {
		return this.uploadService.findRegiao(sigla);
	}

}
