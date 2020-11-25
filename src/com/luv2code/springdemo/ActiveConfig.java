package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ActiveConfig {
	
	// define bean for AngryFortuneService
	@Bean
	public FortuneService AngryFortuneService() {
		return new angryFortuneService() ;
		
	}
	
	// define bean for swimCoach and dependency injection
	@Bean
	public Coach lolCoach() {
		return new LOLCoach(AngryFortuneService());
	}

}
