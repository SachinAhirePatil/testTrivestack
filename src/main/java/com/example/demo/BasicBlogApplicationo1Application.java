package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@EntityScan
@SpringBootApplication
public class BasicBlogApplicationo1Application {

	public static void main(String[] args) {
		SpringApplication.run(BasicBlogApplicationo1Application.class, args);
	}

}
