package com.grasshopper.pfaserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PfaServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(PfaServiceRegistryApplication.class, args);
	}

}
