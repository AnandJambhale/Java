package com.company.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class swimCoach implements Coach{
    private FortuneService fortuneService;
    public swimCoach(FortuneService theFortuneService) {
        fortuneService=theFortuneService;
    }

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDailyWorkout() {
        return "Did 30 minutes in pool";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
