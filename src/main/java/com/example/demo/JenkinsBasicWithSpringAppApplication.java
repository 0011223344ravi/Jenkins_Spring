package com.example.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsBasicWithSpringAppApplication {
	public  static final Logger logger = LoggerFactory.getLogger(JenkinsBasicWithSpringAppApplication.class);

	@PostConstruct
	public void intt() {
		logger.info("Application started ...bhai");
		
	}
	
	@GetMapping("/getMessage")
	public String getMessage() {
		return "Deployment done successfully";
	}

	public static void main(String[] args) {
		
		logger.info("Application executed ...bhai");
		logger.info("Application executed ...bhai second time ");
		SpringApplication.run(JenkinsBasicWithSpringAppApplication.class, args);
		
	}

}
