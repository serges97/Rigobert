package com.example.webservice1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class WebServiceExample {
	
	@GetMapping("/actuator/info")
	 public String sayHello(){
	 return "Hello !";
	 }

}
