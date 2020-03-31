package com.prateek.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring configuration java file

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from the spring container

		Coach coach = context.getBean("tennisCoach", Coach.class);

		// call a method on the bean

		System.out.println(coach.getDailyWorkout());

		System.out.println(coach.getDailyFortune());

		// close the context

		context.close();
	}

}
