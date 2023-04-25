package com.example.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.notification")
public class notifications {

	public static void main(String[] args) {
		SpringApplication.run(notification.class, args);
	}

}
