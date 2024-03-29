package com.example.first_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FirstMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstMicroserviceApplication.class, args);
	}

}
