package com.Practice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        randomFortunes fortune=context.getBean("randomFortunes",randomFortunes.class);

        System.out.println(fortune.getFortune());
    }
}
