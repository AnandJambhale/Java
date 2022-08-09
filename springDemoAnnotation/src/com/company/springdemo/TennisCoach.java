package com.company.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Performed net Practice";
    }
    @Override
    public  String getDailyFortune(){
        return fortuneService.getFortune();
    }

    @Autowired
    @Qualifier("randomFortuneService")   //u have to give small first letter
    private FortuneService fortuneService;

//    @Autowired   //this annotation is not needed from spring 4.3
//    public TennisCoach(FortuneService theFortuneService) {
//        this.fortuneService = theFortuneService;
//    }

    //define a default constructor
    public  TennisCoach(){
        System.out.println("TennisCoach: inside default constructor");
    }

    //define setter
//    @Autowired
//    public  void  setFortuneService(FortuneService theFortuneService){
//        System.out.println("TennisCoach: inside setFortuneService");
//        fortuneService=theFortuneService;
//    }

    @Autowired    //you can perform any method by default byadding this
    public void doSomeCrazyStuff(FortuneService theFortuneService){
        System.out.println("in the doMyStuff");
        fortuneService=theFortuneService;
    }

}
