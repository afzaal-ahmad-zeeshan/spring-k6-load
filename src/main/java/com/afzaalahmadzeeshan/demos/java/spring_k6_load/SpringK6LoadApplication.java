package com.afzaalahmadzeeshan.demos.java.spring_k6_load;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SpringK6LoadApplication {

	@Autowired
	Environment env;

	public static void main(String[] args) {
		SpringApplication.run(SpringK6LoadApplication.class, args);
	}

}
