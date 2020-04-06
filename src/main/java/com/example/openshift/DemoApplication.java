package com.example.openshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
	
	@GetMapping("/")
	public String showMessage() {
		return "Welcome to Openshift World!";
	}
	
	@GetMapping("/{item}")
	public String showPramMessage(@PathVariable String item) {
		return "Helli "+item+ "  Your Application has been deployed Successfully!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
