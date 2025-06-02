package br.iftm.edu.eureka_matematica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaMatematicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaMatematicaApplication.class, args);
	}

}
