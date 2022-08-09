package com.company;

public class actual {
    public static void main(String[] args) {
        HappyFortuneService fortune=new HappyFortuneService();
        Baseballcoach myCoach=new Baseballcoach(fortune);
        System.out.println(myCoach.getDailyFortune());
    }
}
