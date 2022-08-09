package com.company;

import com.cmp.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopeDemoApp {
    public static void main(String[] args) {

        //load spring config file

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //retrieve the beans

        Coach thecoach=context.getBean("mycoach", Coach.class);

        System.out.println(thecoach.getDailyWorkout());
    }
}
