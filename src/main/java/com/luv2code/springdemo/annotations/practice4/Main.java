package com.luv2code.springdemo.annotations.practice4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations/applicationContext.xml");
        Coach cycleCoach = context.getBean("cycleCoach", Coach.class);

        System.out.println(cycleCoach.getDailyWorkout());
    }
}
