package com.luv2code.springdemo;

public class LOLCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public LOLCoach (FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "beat 5 miniion every 2 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
