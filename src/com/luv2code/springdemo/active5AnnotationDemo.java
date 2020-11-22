package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class active5AnnotationDemo {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("acitve5applicationContext.xml");
		
		// get the bean from spring container
		Coach theCoach = context.getBean("badmintonCoach", Coach.class);
		
		// call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// call method to get the dailyWorkout
		System.out.println(theCoach.getDailyWorkout());
		
		// context.close
		context.close();

	}

}
