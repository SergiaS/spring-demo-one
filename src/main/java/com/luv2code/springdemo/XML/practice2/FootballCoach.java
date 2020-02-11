package com.luv2code.springdemo.XML.practice2;

import com.luv2code.springdemo.XML.Coach;
import com.luv2code.springdemo.XML.FortuneService;

public class FootballCoach implements Coach {

    FortuneService fortuneService;

    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Today program is 500 squats!";
    }

    @Override
    public String getDailyFortune() {
        return "POWWEEEEER";
    }
}
