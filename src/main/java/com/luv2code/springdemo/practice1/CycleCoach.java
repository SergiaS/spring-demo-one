package com.luv2code.springdemo.practice1;

import com.luv2code.springdemo.Coach;

public class CycleCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Get 100 km for 3 hours";
    }

    @Override
    public String getDailyFortune() {
        return "Have a fun ride";
    }
}
