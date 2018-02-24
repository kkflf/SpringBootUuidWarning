package com.kkflf;

import javax.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class UuidWarningProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(UuidWarningProjectApplication.class, args);
	}
}
