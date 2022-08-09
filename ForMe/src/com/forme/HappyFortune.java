package com.forme;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements FortuneService{
    @Override
    public String getFortune() {
        return "Have a happy day";
    }
}
