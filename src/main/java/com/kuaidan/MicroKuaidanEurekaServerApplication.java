package com.kuaidan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroKuaidanEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroKuaidanEurekaServerApplication.class, args);
	}
}
