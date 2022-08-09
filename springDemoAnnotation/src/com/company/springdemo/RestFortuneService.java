package com.company.springdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class RestFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return null;
    }
}
