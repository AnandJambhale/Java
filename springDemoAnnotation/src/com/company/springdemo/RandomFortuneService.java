package com.company.springdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{

    //Create an array of String
    private String[]data={"ohh","Hello","Right"};

    //create random number
    private Random myRandom=new Random();

    @Override
    public String getFortune() {
        int index=myRandom.nextInt(data.length);
        String theFortune=data[index];
        return theFortune;
    }
}
