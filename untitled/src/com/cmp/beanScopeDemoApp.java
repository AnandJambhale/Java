package com.cmp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopeDemoApp {
    public static void main(String[] args) {

        //load spring config file

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //retrieve the beans

        Trackcoach thecoach=context.getBean("mycoach",Trackcoach.class);
        Trackcoach alphacoach=context.getBean("mycoach",Trackcoach.class);


        // check if they are the same
        boolean result=(thecoach==alphacoach);
        System.out.println(result);
        System.out.println(alphacoach);
        System.out.println(thecoach);
    }
}
