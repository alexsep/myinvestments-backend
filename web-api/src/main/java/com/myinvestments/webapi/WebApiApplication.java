package com.myinvestments.webapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.myinvestments.adapter")
@EntityScan("com.myinvestments.adapter")
@SpringBootApplication(scanBasePackages = "com.myinvestments")
public class WebApiApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(WebApiApplication.class, args);
	}
}
