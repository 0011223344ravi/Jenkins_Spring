package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsBasicWithSpringAppApplicationTests {
	public  static final Logger logger = LoggerFactory.getLogger(JenkinsBasicWithSpringAppApplication.class);

	@Test
	public void contextLoads() {
		logger.info("test case executing ");
		logger.info("test case executing for second time  ");
		
		
		assertEquals(true, true);
	}

}
