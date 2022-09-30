package com.comapny;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class empFetcher {
    public static void main(String[] args) {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();

        Session session=factory.openSession();

        Emp emp=(Emp) session.load(Emp.class,1);
        System.out.println(emp.getProject());

        session.close();
        factory.close();
    }
}
