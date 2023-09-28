package com.example.examen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ExamenCl1OficialApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamenCl1OficialApplication.class, args);
	}

}
