package com.reset.peopleservicereal.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/realpeople")
public class PeopleServiceRealApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeopleServiceRealApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}

}
