package com.luv2code.springdemo.annotations.practice4;

import org.springframework.stereotype.Component;

@Component
public class CycleCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Ride 150 km";
    }
}
