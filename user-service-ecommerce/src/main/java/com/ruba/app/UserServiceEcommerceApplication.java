package com.ruba.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserServiceEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceEcommerceApplication.class, args);

	}

}
