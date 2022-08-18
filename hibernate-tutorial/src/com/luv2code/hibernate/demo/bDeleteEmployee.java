package com.luv2code.hibernate.demo;

import com.luv2code.hidernate.demo.entity.Employee;
import com.luv2code.hidernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class bDeleteEmployee {
    public static void main(String[] args) {
        SessionFactory factory=new  Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();

        Session session=factory.getCurrentSession();

        try {
            int eid=5;

            session= factory.getCurrentSession();
            session.beginTransaction();

//            Employee employee=session.get(Employee.class,eid);
//
//            session.delete(employee);
            session.createQuery("delete from Employee where first_name='Vilas'").executeUpdate();

            session.getTransaction().commit();
        }
        finally {
            factory.close();
        }
    }
}
