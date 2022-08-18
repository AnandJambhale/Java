package com.luv2code.hibernate.demo;

import com.luv2code.hidernate.demo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class bReadEmployee {
    public static void main(String[] args) {
        SessionFactory factory=new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Employee.class).buildSessionFactory();

        Session session= factory.getCurrentSession();

        try {
            Employee employee2=new Employee("Vilas","Jambahle",7,7);

            session.beginTransaction();

            session.save(employee2);

            session.getTransaction().commit();

            //to read
            session=factory.getCurrentSession();

            session.beginTransaction();

            Employee employee=session.get(Employee.class,employee2.getId());
            System.out.println(employee);

            session.getTransaction().commit();
        }
        finally {
            factory.close();
        }
    }
}
