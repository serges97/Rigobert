package com.example.Microservice3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Microservice3Application {
	
	@Autowired
	private LoadBalancerClient loadBalancer;
	@GetMapping(…)
	public void method() {
	ServiceInstance serviceInstance = loadBalancer.choose("WebService1");
	System.out.println(serviceInstance.getUri());

	public static void main(String[] args) {
		SpringApplication.run(Microservice3Application.class, args);
	}

}
