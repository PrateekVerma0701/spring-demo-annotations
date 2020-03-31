package com.prateek.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring configuration java file

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from the spring container

		SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);

		// call a method on the bean

		System.out.println(coach.getDailyWorkout());

		System.out.println(coach.getDailyFortune());

		// call our new swim coach method

		System.out.println("Email : " + coach.getEmail());

		System.out.println("Team : " + coach.getTeam());

		// close the context

		context.close();
	}

}
