package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach {
	
	@Autowired
	@Qualifier("COMPUTFortuneService")
	private FortuneService fortuneService;
	public BadmintonCoach() {
		System.out.println(">>TennisCoach: inside the deafult constructor"); 
	}

	@Override
	public String getDailyWorkout() {
		return "Hit the feather rather than the ball";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
