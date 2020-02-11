package com.luv2code.springdemo.practice1;

import com.luv2code.springdemo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPractice {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextPractice1.xml");
        Coach cycleCoach = context.getBean("cycleCoach", Coach.class);

        System.out.println(cycleCoach.getDailyWorkout());
        System.out.println(cycleCoach.getDailyFortune());

        context.close();
    }
}
