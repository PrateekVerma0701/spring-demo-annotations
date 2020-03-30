package com.prateek.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	// define a default constructor, though it is not required.

	public TennisCoach() {
		System.out.println("Tennis Coach :  inside default constructor");
	}

	/*
	 * @Autowired public TennisCoach(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */

	// define a setter method

	/*
	 * @Autowired public void doMyStuff(FortuneService fortuneService) {
	 * System.out.println("Tennis Coach :  inside doMyStuff() method");
	 * this.fortuneService = fortuneService; }
	 */

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
