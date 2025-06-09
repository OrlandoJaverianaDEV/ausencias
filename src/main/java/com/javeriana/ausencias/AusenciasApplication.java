package com.javeriana.ausencias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AusenciasApplication {

	public static void main(String[] args) {

		SpringApplication.run(AusenciasApplication.class, args);
		System.out.println("Ausencias running...");
	}

}
