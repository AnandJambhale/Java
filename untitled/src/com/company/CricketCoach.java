package com.company;

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
}
