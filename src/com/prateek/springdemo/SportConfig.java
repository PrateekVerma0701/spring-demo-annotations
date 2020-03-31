package com.prateek.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

	// define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	// define bean for our swim coach and inject dependencies

	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
