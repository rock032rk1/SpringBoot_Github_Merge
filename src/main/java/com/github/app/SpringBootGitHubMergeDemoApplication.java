package com.github.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootGitHubMergeDemoApplication {

	@PostMapping("/purchase/{userName}/{amount}/{productName}")
	public String purchase(@PathVariable String userName, @PathVariable double amount,
			@PathVariable String productName) {

		
		return "Hi "+userName+" Order for "+productName+" with amount "+amount+ " store successfully";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGitHubMergeDemoApplication.class, args);
	}

}
