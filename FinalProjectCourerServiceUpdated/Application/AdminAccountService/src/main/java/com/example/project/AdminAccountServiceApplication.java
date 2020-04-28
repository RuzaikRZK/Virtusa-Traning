package com.example.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@SpringBootApplication


public class AdminAccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminAccountServiceApplication.class, args);
	}

}
