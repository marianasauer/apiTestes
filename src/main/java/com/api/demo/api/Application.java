package com.api.demo.api;

import com.api.demo.api.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	User user = new User(1, "valdir", "email@gmail.com", "1234");
}
