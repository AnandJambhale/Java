package com.company;

public class Baseballcoach implements Coach{
    private FortuneService fortuneService;

    public Baseballcoach(FortuneService theFortuneService){
        fortuneService=theFortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Spent 30 minutes in practice";
    }


    //use fortuneService to get fortune
    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
