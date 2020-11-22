package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Hit the feather rather than the ball";
	}

}