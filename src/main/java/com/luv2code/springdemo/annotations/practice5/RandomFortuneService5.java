package com.luv2code.springdemo.annotations.practice5;

import com.luv2code.springdemo.annotations.FortuneService;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RandomFortuneService5 implements FortuneService {

//    private String filePath = "";
//    private List<String> fortuneList;
//
//    // create a random number generator
//    private Random random = new Random();
//
//    public RandomFortuneService5() {
//        File file = new File(filePath);
//
//        System.out.println("Reading fortunes from file: " + file);
//        System.out.println("File exists: " + file.exists());
//
//        // initialize array list
//        fortuneList = new ArrayList<>();
//
//        // read fortunes from file
//        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//            String tmpLine;
//            while ((tmpLine = br.readLine()) != null) {
//                fortuneList.add(tmpLine);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public String getFortune() {
//        int index = random.nextInt(fortuneList.size());
//
//        return fortuneList.get(index);
//    }


    // my version
        @Override
    public String getFortune() {
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

        String[] arr = s.split("\n");


        return arr[new Random().nextInt(arr.length)];
    }
}
