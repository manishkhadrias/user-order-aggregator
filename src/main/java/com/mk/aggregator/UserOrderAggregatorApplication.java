package com.mk.aggregator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class UserOrderAggregatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserOrderAggregatorApplication.class, args);
	}

}
