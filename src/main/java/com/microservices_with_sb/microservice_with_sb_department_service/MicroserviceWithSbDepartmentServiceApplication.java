package com.microservices_with_sb.microservice_with_sb_department_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceWithSbDepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceWithSbDepartmentServiceApplication.class, args);
	}

}
