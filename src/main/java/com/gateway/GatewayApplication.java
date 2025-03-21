package com.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
		System.out.println("Gateway Application started");
		System.out.println("Gateway Application started --- oooTesting webhooks now once again.");
		System.out.println("Gateway Application started --- ppppTesting webhooks now once again.");
	}

}
