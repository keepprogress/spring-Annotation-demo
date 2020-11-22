package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class active4AnnotationDemoApp {

	public static void main(String[] args) {
		
		// add configuration to the spring container
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from the spring container
		Coach theCoach = context.getBean("badmintonCoach", Coach.class);
		
		// use the bean
		System.out.println(theCoach.getDailyWorkout());
		
		
		// close context
		context.close();
	}

}
