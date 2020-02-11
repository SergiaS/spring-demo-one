package com.luv2code.springdemo.XML.practice2;

import com.luv2code.springdemo.XML.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPractice {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml/applicationContextPractice2.xml");

//        RandomFortuneService randomFortuneService = context.getBean("randomFortuneService", RandomFortuneService.class);
//
//        System.out.println(randomFortuneService.getFortune());

        Coach theCoach = context.getBean("myFootballCoach", Coach.class);
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());

    }
}