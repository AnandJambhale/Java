package com.company.springdemo;


import org.springframework.stereotype.Component;

@Component    //if u are not stating here anything then default bean id will be same as class id with lower first letter
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Spent 30 minutes in net";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}