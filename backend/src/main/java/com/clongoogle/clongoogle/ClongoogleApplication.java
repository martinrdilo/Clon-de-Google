package com.clongoogle.clongoogle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class ClongoogleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClongoogleApplication.class, args);
	}

}
