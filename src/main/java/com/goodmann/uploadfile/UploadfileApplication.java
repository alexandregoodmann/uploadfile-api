package com.goodmann.uploadfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
@SpringBootApplication
public class UploadfileApplication {

	// @Autowired
	// private AgentesRepository agentesRepository;

	public static void main(String[] args) {
		SpringApplication.run(UploadfileApplication.class, args);
	}

}
