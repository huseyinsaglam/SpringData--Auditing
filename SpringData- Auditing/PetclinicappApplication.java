package com.example.petclinicapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing(auditorAwareRef="petClinicAuditorAware")
@SpringBootApplication
public class PetclinicappApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetclinicappApplication.class, args);
	}

}
