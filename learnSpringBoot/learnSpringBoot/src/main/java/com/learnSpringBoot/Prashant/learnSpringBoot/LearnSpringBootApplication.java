package com.learnSpringBoot.Prashant.learnSpringBoot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringBootApplication implements CommandLineRunner {

	DB db;

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringBootApplication.class, args);



	}

	@Override
	public void run(String... args) throws Exception {
		db = new ProdDb();
		System.out.println(db.getData());
	}
}
