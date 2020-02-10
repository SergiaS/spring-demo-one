package com.luv2code.springdemo.practice2;

import com.luv2code.springdemo.FortuneService;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

    private String[] fortuneArr = new String[]{
            "Good luck",
            "Your are winner",
            "ByiA"
    };

    @Override
    public String getFortune() {
        return fortuneArr[new Random().nextInt(3)];
    }
}
