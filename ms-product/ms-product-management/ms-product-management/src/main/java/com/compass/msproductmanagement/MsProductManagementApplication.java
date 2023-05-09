package com.compass.msproductmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsProductManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProductManagementApplication.class, args);
	}

}
