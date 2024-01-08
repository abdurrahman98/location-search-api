package com.codexist.locationsearchapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LocationSearchApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocationSearchApiApplication.class, args);
	}

}
