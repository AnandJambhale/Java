package com.company.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Have a happy day";
    }
}
