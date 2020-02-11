package com.luv2code.springdemo.XML.practice3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml/applicationContextPractice3.xml");
        CycleCoach cycleCoach = context.getBean("cycleCoach", CycleCoach.class);

        System.out.println(cycleCoach.getDailyWorkout());
    }
}
