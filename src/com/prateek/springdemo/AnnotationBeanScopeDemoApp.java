package com.prateek.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		// load spring configuration file

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		Coach coach = context.getBean("tennisCoach", Coach.class);

		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

		// check if they are the same
		boolean result = (coach == alphaCoach);

		// print out the result

		System.out.println("\n Pointing to the same object : " + result);

		System.out.println("\n Memory location for the coach : " + coach);

		System.out.println("\n Memory location for the aplhaCoach : " + alphaCoach);

		// close the context
		context.close();
	}

}
