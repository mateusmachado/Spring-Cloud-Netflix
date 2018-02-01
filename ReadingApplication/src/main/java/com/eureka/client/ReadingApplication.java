package com.eureka.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.client.service.BookService;

@EnableCircuitBreaker
@RestController
@EnableEurekaClient
@EnableHystrixDashboard
@SpringBootApplication
public class ReadingApplication {

	@Autowired
	private BookService bookService;

	@RequestMapping("/to-read")
	public String toRead() {
		return bookService.readingList();
	}

	@RequestMapping("/to-buy")
	public String toBuy() {
		return bookService.buy();
	}

	public static void main(String[] args) {
		SpringApplication.run(ReadingApplication.class, args);
	}
}
