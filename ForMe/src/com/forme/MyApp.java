package com.forme;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach=context.getBean("sillyCoach",Coach.class);
//        Coach theCoach=context.getBean("myCoach",Coach.class);
//        FortuneService Fort=context.getBean("happyFortune",HappyFortune.class);


//        System.out.println(theCoach.getDailyWorkout());
//        System.out.println(theCoach.getDailyFortune());

//        System.out.println(theCoach.getDailyFortune());
//        System.out.println(Fort.getFortune());


        baseballCoach coach=context.getBean("sillyCoach",baseballCoach.class);
        System.out.println(coach.getEmail());

        context.close();
    }
}
