package com.luv2code.springdemo.annotations;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {

    @Override
    public String getFortune() {
        return null;
    }
}
