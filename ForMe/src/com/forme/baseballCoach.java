package com.forme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sillyCoach")
public class baseballCoach implements Coach{

    private FortuneService fortuneService;
    @Override
    public String getDailyWorkout() {
        return "Did 30 minutes practice";
    }

    @Autowired
    public baseballCoach(FortuneService theFortuneService){
        fortuneService=theFortuneService;
    }
//    @Autowired     //two methods cant be autowired at once
//    public baseballCoach(){
//        System.out.println("In default");
//    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService thefortuneService){
        fortuneService=thefortuneService;
    }

    private  String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    //background
//    public static void main(String[] args) {
//        FortuneService myFortune=new HappyFortune();
//
//        baseballCoach gh=new baseballCoach(myFortune);
//        System.out.println(gh.getDailyFortune());
//    }
}
