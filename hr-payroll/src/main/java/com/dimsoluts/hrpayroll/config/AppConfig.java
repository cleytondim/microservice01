package com.dimsoluts.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

	//Singleton Pattern
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
