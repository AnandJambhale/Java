package com.forme;

import java.util.Random;

public class RandomFortune implements FortuneService{
    @Override
    public String getFortune() {
        String[]fortunes={"Hi how are you", "Have a happy day","Good Thank you"};
        Random r=new Random();
        int random=r.nextInt(fortunes.length);
        return fortunes[random];
    }
}
