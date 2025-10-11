package com.afzaalahmadzeeshan.demos.java.spring_k6_load;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.Environment;

import com.microsoft.applicationinsights.attach.ApplicationInsights;
import com.microsoft.applicationinsights.connectionstring.ConnectionString;

@SpringBootApplication
public class SpringK6LoadApplication {

	@Autowired
	Environment env;

	Logger logger = Logger.getLogger(SpringK6LoadApplication.class.getName());

	@EventListener(ApplicationReadyEvent.class)
	public void doSomethingAfterStartup() {
		String connectionString = env.getProperty("APPLICATIONINSIGHTS_CONNECTION_STRING");

		ApplicationInsights.attach(); // Attach Application Insights agent
		ConnectionString.configure(connectionString); // Set your connection string here
		logger.info("Configured Application Insights.");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringK6LoadApplication.class, args);
	}
}
