package com.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootFirstAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFirstAppApplication.class, args);
		System.out.print("Here");
	}

}
