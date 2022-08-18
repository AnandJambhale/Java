package com.luv2code.hibernate.demo;

import com.luv2code.hidernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class aUpdateStudentDemo {
    public static void main(String[] args) {
        //create session factory
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        //create new session
        Session session=factory.getCurrentSession();

        try {
            int studentId=3;

            //now get a new session and start transaction
            session=factory.getCurrentSession();
            session.beginTransaction();

            //retrieve the student based on id:primary key
            System.out.println("\nGetting student with id: "+studentId);

            Student myStudent=session.get(Student.class, studentId);

            System.out.println("Updating student ....");
            myStudent.setFirstName("Scooby");

            //commit transaction
            session.getTransaction().commit();  //it save in database here



            //NEW CODE
            //to update all emails
            session=factory.getCurrentSession();
            session.beginTransaction();

            //update email for all student
            System.out.println("Update email for all students");

            session.createQuery("update Student set email='avjambhale21@gmail.com'").executeUpdate();

            //commit transaction
            session.getTransaction().commit();

            System.out.println("done...!");
        }
        finally {
            factory.close();
        }
    }
}
