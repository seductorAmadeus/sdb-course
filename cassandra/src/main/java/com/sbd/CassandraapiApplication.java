package com.sbd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.sbd")
public class CassandraapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CassandraapiApplication.class, args);
	}
}
