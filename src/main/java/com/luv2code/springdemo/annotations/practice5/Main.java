package com.luv2code.springdemo.annotations.practice5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations/applicationContext5.xml");
        CoachP5 cycleCoach = context.getBean("cycleCoachP5", CoachP5.class);

//        System.out.println(cycleCoach.getDailyWorkout());
        System.out.println(cycleCoach.getDailyFortune());
        System.out.println(cycleCoach.getDailyFortune());
        System.out.println(cycleCoach.getDailyFortune());
        System.out.println(cycleCoach.getDailyFortune());
        System.out.println(cycleCoach.getDailyFortune());
        System.out.println(cycleCoach.getDailyFortune());
        System.out.println(cycleCoach.getDailyFortune());

        context.close();
    }
}