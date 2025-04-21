package com.ruba.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscoveryEcommerceApplication.class, args);
	}
	
	

}







