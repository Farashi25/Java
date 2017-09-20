package com.codingdojo.StringsAssignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringsAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsAssignmentApplication.class, args);
	}
	@RequestMapping("/")
	public String hello() {
		return "Hello, I am a String!";
	}
	
	@RequestMapping("/random")
	public String randon() {
		return "I am displaying well";
	}
}
