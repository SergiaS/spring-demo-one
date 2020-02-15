package com.luv2code.springdemo.javaConfig.practice7;

import com.luv2code.springdemo.javaConfig.FortuneService;

public class FixFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Go-Go-Go";
    }
}
