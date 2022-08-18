package com.luv2code.hibernate.demo;

import com.luv2code.hidernate.demo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class bUpdateEmployee {
    public static void main(String[] args) {
        SessionFactory factory=new Configuration().configure().addAnnotatedClass(Employee.class).buildSessionFactory();

        Session session= factory.getCurrentSession();

        try {
            int id=8;
            session.beginTransaction();

            session.createQuery("update Employee set first_name='Vilas'").executeUpdate();

//            Employee myEmployee=session.get(Employee.class , id);
//
//            myEmployee.setFirstName("Vilas");

            session.getTransaction().commit();
        }
        finally {
            factory.close();
        }
    }
}
