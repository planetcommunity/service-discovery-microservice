package com.planet.planetgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PlanetGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlanetGatewayApplication.class, args);
	}

}
