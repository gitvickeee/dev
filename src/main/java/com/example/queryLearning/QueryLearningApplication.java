package com.example.queryLearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class QueryLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(QueryLearningApplication.class, args);
	}

}
