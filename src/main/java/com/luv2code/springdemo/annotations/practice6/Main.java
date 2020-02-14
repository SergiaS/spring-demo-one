package com.luv2code.springdemo.annotations.practice6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations/applicationContext6.xml");
        CoachP6 cycleCoach = context.getBean("cycleCoachP6", CoachP6.class);

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