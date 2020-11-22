package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class COMPUTFortuneService implements FortuneService {
	private String[] data = {
			"Beware the thing behind you",
			"Today definitely your day",
			"Don't go out today"
	};
	
	Random myRandom = new Random();
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.teamName}")
	private String teamName;

	
	@Override
	public String getFortune() {
		
		int index = myRandom.nextInt(data.length);
		return data[index] + "\n" + email + "\n" + teamName;
	}

}
