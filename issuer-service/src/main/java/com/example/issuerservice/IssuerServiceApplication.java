package com.example.issuerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
public class IssuerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IssuerServiceApplication.class, args);
	}

}
