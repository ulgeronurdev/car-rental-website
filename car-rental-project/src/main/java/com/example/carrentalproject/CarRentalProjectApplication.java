package com.example.carrentalproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class CarRentalProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(CarRentalProjectApplication.class, args);
	}

}
