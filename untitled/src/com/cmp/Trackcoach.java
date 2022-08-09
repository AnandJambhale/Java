package com.cmp;

import com.company.Coach;
import com.company.FortuneService;

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

    //add an init method
    public void doMyStartupStuff(){
        System.out.println("trackCoach: inside startup method");
    }

    //add a destroy method
    public void doMyCleanupStuff(){
        System.out.println("Trackcoach:inside cleanup");
    }
}
