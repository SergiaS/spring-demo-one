package com.luv2code.springdemo.annotations.practice6;

import com.luv2code.springdemo.annotations.FortuneService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

@Component
public class RandomFortuneService6 implements FortuneService {

    private String[] arr;

    public RandomFortuneService6() {
        System.out.println("Inside constructor RandomFortuneService6()");
    }

    @PostConstruct
    private void initFortuneService(){
        System.out.println("Inside method initFortuneService()");

        File filePath = new File("fortune.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String s = "";
        while (true) {
            try {
                if (!fr.ready()) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                s += (char)fr.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        arr = s.split("\n");
    }

    @Override
    public String getFortune() {
        return arr[new Random().nextInt(arr.length)];
    }
}
