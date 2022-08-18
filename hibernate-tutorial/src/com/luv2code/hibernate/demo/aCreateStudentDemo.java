package com.luv2code.hibernate.demo;

import com.luv2code.hidernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class aCreateStudentDemo {
    public static void main(String[] args) {
        //create session factory
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        //create new session
        Session session=factory.getCurrentSession();

        try {
            //use session object to sava java object
            System.out.println("creating a new student object.....");
            Student tempStudent =new Student("Paul", "Wall", "anandjambhalke21@gmail.com");

            //create student object
            session.beginTransaction();

            //start transaction
            System.out.println("Saving the student.....");
            session.save(tempStudent);

            //commit transaction
            session.getTransaction().commit();
            System.out.println("done...!");
        }
        finally {
            factory.close();
        }
    }
}
