package com.example.PaymentService2forEurekha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PaymentService2ForEurekhaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentService2ForEurekhaApplication.class, args);
		System.out.println("hello Eurekha Client ");

	}

}
