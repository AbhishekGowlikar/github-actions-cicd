package com.example.githubcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubcicdApplication {

	@GetMapping("/welcome")
	public String welcome(){
      return "Welcome to TEK Systems !!!";
	}
	public static void main(String[] args) {
		SpringApplication.run(GithubcicdApplication.class, args);
	}
}