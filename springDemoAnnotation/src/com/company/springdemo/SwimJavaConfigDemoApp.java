package com.company.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(sportsConfig.class);

        swimCoach theCoach=context.getBean("swimCoach",swimCoach.class);

        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());

        //calling properties
        System.out.println(theCoach.getEmail());
        System.out.println(theCoach.getTeam());

        context.close();
    }
}
