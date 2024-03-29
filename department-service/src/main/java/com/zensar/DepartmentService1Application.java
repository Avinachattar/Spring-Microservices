package com.zensar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DepartmentService1Application {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentService1Application.class, args);
	}

}
