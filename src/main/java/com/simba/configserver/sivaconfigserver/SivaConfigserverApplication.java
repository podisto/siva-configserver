package com.simba.configserver.sivaconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SivaConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SivaConfigserverApplication.class, args);
	}

}
