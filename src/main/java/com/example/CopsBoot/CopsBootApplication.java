package com.example.CopsBoot;

import com.example.orm.jpa.UniqueIdGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class CopsBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CopsBootApplication.class, args);
	}

//	@Bean
//	public UniqueIdGenerator<UUID> uniqueIdGenerator() {
//		return new InMemoryUniqueIdGenerator();
//	}
}
