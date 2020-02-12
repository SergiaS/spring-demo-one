package com.luv2code.springdemo.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    @Override
    public String getDailyWorkout() {
        return "Swim above 3 km";
    }

    @Override
    public String getDailyFortune() {
        return "Catch your wave with team " + team;
    }
}
