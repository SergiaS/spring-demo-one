package com.luv2code.springdemo.annotations.practice5;

import com.luv2code.springdemo.annotations.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class CycleCoachP5 implements CoachP5 {

    @Autowired
    FortuneService fortuneService;

//    @Autowired
//    public CycleCoachP5(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Ride 150 km";
    }

    @Override
    public String getMonthStat() {
        return "You have ride 1200km";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}