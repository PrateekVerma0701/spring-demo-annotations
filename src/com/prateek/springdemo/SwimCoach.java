package com.prateek.springdemo;

import org.springframework.beans.factory.annotation.Autowired;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;

	@Autowired
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swin 1000 meters as a warm up";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
