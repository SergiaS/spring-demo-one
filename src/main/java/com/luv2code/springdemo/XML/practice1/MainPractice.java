package com.luv2code.springdemo.XML.practice1;

import com.luv2code.springdemo.XML.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPractice {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml/applicationContextPractice1.xml");
        Coach cycleCoach = context.getBean("cycleCoach", Coach.class);

        System.out.println(cycleCoach.getDailyWorkout());
        System.out.println(cycleCoach.getDailyFortune());

        context.close();
    }
}
