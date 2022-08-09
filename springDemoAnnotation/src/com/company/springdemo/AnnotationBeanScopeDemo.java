package com.company.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach=context.getBean("tennisCoach",Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        context.close();
    }
}
