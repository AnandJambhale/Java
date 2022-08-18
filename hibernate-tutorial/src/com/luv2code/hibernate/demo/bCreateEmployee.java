package com.luv2code.hibernate.demo;

import com.luv2code.hidernate.demo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class bCreateEmployee {
    public static void main(String[] args) {
        SessionFactory factory=new Configuration().configure().addAnnotatedClass(Employee.class).buildSessionFactory();

        Session session= factory.getCurrentSession();

        try {
            Employee employee1=new Employee("Anand","Vilas",8,58);

            session.beginTransaction();

            session.save(employee1);

            session.getTransaction().commit();
        }
        finally {
            factory.close();
        }
    }
}
