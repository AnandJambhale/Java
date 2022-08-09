package com.cmp;

import com.company.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        CricketCoach theCoach=context.getBean("myCricketCoach",CricketCoach.class);

        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());

        context.close();
    }
}
