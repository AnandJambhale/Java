package com.cmp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanLifeCycleDemoApp {
    public static void main(String[] args) {

        //load spring config file

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        //retrieve the beans

        Trackcoach thecoach=context.getBean("mycoach",Trackcoach.class);
        Trackcoach hecoach=context.getBean("mycoach",Trackcoach.class);


        // check if they are the same
        System.out.println(thecoach.getDailyWorkout());
        System.out.println((thecoach==hecoach));       //singleton and prototype scopes are learned

        context.close();
    }
}
