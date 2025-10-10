package com.afzaalahmadzeeshan.demos.java.spring_k6_load;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import com.microsoft.applicationinsights.attach.ApplicationInsights;
import com.microsoft.applicationinsights.connectionstring.ConnectionString;

@SpringBootApplication
public class SpringK6LoadApplication {

	@Autowired
	Environment env;

	public static void main(String[] args) {
		String connectionString = env.getProperty("APPLICATIONINSIGHTS_CONNECTION_STRING");

		ApplicationInsights.attach(); // Attach Application Insights agent
		ConnectionString.configure(connectionString); // Set your connection string here
		SpringApplication.run(SpringK6LoadApplication.class, args);
	}
}
