package com.web.Login.And.Registration.REST.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class LoginAndRegistrationRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginAndRegistrationRestApiApplication.class, args);
	}

}
