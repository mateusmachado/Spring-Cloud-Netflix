package com.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
@EnableHystrix
@SpringBootApplication
public class EurekaClientApplication {

	@RequestMapping(value = "/recommendded")
	public String readingList() {
		return "Books List..";
	}
	
	@RequestMapping(value = "/buy")
	public String buyList() {
		return "Books Other List";
	}

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}
}
