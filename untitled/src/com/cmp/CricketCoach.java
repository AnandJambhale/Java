package com.cmp;

import com.company.Coach;
import com.company.FortuneService;

public class CricketCoach implements Coach {

    private CricketCoach(){
        System.out.println("I am in the no-arg constructor");
    }

    private FortuneService fortuneService;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "spent 30 minutes in net practice";
    }

    @Override
    public String getDailyFortune() {
        return "Do ball practice "+fortuneService.getFortune();
    }

    private String emailAddress;
    private String team;

    public void setEmailAddress(String emailAddress) {
        System.out.println("I am in emailAddress");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmailAddress() {

        return emailAddress;
    }

    public String getTeam() {
        return team;
    }
}
