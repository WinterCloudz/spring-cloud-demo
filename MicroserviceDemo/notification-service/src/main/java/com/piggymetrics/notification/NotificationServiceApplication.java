package com.piggymetrics.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@EnableFeignClients
@EnableCircuitBreaker
public class NotificationServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(NotificationServiceApplication.class, args);
	}

}
