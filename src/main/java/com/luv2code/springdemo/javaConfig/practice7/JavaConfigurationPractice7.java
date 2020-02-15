package com.luv2code.springdemo.javaConfig.practice7;

import com.luv2code.springdemo.javaConfig.Coach;
import com.luv2code.springdemo.javaConfig.FortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigurationPractice7 {

    @Bean
    public FortuneService fixFortuneService(){
        return new FixFortuneService();
    }

    @Bean
    public Coach businessCoach(){
        return new BusinessCoach(fixFortuneService());
    }
}
