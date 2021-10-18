package com.uc.BoredNoMore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BoredNoMoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoredNoMoreApplication.class, args);
	}
	
	/**
	 * Required for RestTemplate implementation in the BoredAPI services
	 * @return
	 */
	@Bean
	public RestTemplate getRestTemplate() {return new RestTemplate();}

}
