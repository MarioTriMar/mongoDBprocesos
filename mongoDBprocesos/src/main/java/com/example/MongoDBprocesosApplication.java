package com.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.controller.UsuarioController;




@SpringBootApplication
@ServletComponentScan

public class MongoDBprocesosApplication extends SpringBootServletInitializer{

	
	
	public static void main(String[] args) {
		SpringApplication.run(MongoDBprocesosApplication.class, args);
	}

	

}
