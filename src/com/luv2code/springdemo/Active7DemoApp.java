package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Active7DemoApp {

	public static void main(String[] args) {

		// read spring config file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ActiveConfig.class);
		
		// retrieve bean from spring container
	    LOLCoach theCoach = context.getBean("lolCoach", LOLCoach.class);
		
		// call methods
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		// close context
		context.close();
	}

}
