package com.company;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {

        //load the spring configuration file
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve the bean from container
        Coach theCoach=context.getBean("myCoach",Coach.class);
        Coach thecoach=context.getBean("mycoach",Coach.class);
        Coach cricketCoach=context.getBean("myCricketCoach",CricketCoach.class);

        //call methods on bean
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        System.out.println(thecoach.getDailyFortune());

        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());


        //close the context
        context.close();
    }
}
