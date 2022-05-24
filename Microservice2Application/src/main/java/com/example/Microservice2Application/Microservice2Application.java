package com.example.Microservice2Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication

@HystrixCommand(fallbackMethod = "defaultMessage")
@GetMapping(…)
public String hello() {
…
}
public String defaultMessage() {
return "Salut !";
}

public class Microservice2Application {
	@EnableCircuitBreaker
	public static void main(String[] args) {
		SpringApplication.run(Microservice2Application.class, args);
	}

}
