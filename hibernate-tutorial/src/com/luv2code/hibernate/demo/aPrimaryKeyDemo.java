package com.luv2code.hibernate.demo;

import com.luv2code.hidernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class aPrimaryKeyDemo {
    public static void main(String[] args) {
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        //create new session
        Session session=factory.getCurrentSession();

        try {
            //create 3 student object
            System.out.println("creating 3 student object.....");
            Student tempStudent1 =new Student("Anand", "Jambhale", "anandjambhale21@gmail.com");
            Student tempStudent2 =new Student("Ana", "Jamble", "anandjambhale@gmail.com");
            Student tempStudent3 =new Student("And", "Jamle", "anandhale21@gmail.com");


            //create student object
            session.beginTransaction();

            //start transaction
            System.out.println("Saving the student.....");
            session.save(tempStudent1);
            session.save(tempStudent2);
            session.save(tempStudent3);

            //commit transaction
            session.getTransaction().commit();
            System.out.println("done...!");
        }
        finally {
            factory.close();
        }
    }
}
