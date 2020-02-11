package com.luv2code.springdemo.XML;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is you lucky day!";
    }
}
