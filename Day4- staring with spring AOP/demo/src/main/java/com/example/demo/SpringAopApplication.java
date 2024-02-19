package com.example.demo;

import com.example.demo.business.Business1;
import com.example.demo.business.Business2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {
	private Logger logger5 = LoggerFactory.getLogger(this.getClass());
	private Business1 business1;

	public SpringAopApplication(Business1 business1, Business2 business2) {
		this.business1 = business1;
		this.business2 = business2;
	}

	private Business2 business2;

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
        logger5.info(business1.calculateSomethingFromRetrievedDataFromDataBase());
		logger5.info(business2.calculateSomethingFromRetrievedDataFromDataBase());
	}
}
