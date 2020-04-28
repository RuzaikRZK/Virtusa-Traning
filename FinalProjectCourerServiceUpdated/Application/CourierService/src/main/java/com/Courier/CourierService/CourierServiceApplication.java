package com.Courier.CourierService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "localhost:4200")
@SpringBootApplication
@EnableResourceServer
public class CourierServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourierServiceApplication.class, args);
	}

}
