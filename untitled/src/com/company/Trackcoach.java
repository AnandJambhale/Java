package com.company;

public class Trackcoach implements Coach {

    private FortuneService fortuneService;

    public Trackcoach(FortuneService theFortuneService){
        fortuneService=theFortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Ran for 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it "+fortuneService.getFortune();
    }
}
