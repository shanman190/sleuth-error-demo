package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@SpringBootApplication
@RestController
public class SleuthErrorDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(SleuthErrorDemoApplication.class, args);
	}

	@Bean
	public CommonsRequestLoggingFilter commonsRequestLoggingFilter() {
		CommonsRequestLoggingFilter filter = new CommonsRequestLoggingFilter();
		filter.setIncludeQueryString(true);
		filter.setIncludeClientInfo(true);
		return filter;
	}

	@RequestMapping("/hello")
	public String hello() {
		return "Hello, world!";
	}
}
