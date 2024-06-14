package com.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
 class Lab7Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab7Application.class, args);
	}

}
