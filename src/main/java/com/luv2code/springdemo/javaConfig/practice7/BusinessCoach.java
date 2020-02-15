package com.luv2code.springdemo.javaConfig.practice7;

import com.luv2code.springdemo.javaConfig.Coach;
import com.luv2code.springdemo.javaConfig.FortuneService;

public class BusinessCoach implements Coach {

    FortuneService fortuneService;

    public BusinessCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Do it more!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
