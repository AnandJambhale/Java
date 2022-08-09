package com.company.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
//        //read spring config file
//        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        //get bean spring container
//        Coach theCoach=context.getBean("thatSillyCoach",Coach.class);
//        Coach coach=context.getBean("cricketCoach",CricketCoach.class);
//
//        //call method
//        System.out.println(theCoach.getDailyWorkout());
//        System.out.println(coach.getDailyWorkout());
//
//        //call method to get daily fortune
//        System.out.println(theCoach.getDailyFortune());
//
//        //close context
//        context.close();

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(sportsConfig.class);
        Coach theCoach=context.getBean("tennisCoach",Coach.class);
        theCoach.getDailyFortune();
        theCoach.getDailyWorkout();
    }
}
