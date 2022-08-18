package com.luv2code.hibernate.demo;

import com.luv2code.hidernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class aReadStudentDemo {
    public static void main(String[] args) {
        //create session factory
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        //create new session
        Session session=factory.getCurrentSession();

        try {
            //use session object to sava java object
            System.out.println("creating a new student object.....");
            Student tempStudent =new Student("Daffy", "Duck", "jambhalke21@gmail.com");

            //create student object
            session.beginTransaction();

            //start transaction
            System.out.println("Saving the student.....");
            System.out.println(tempStudent);
            session.save(tempStudent);

            //commit transaction
            session.getTransaction().commit();

            //MY NEW CODE

            //find out student id:primary key
            System.out.println("Saved student.Generated id: "+tempStudent.getId());

            //now get a new session and start transaction
            session=factory.getCurrentSession();
            session.beginTransaction();

            //retrieve the student based on id:primary key
            System.out.println("\nGetting student with id: "+tempStudent.getId());

            Student myStudent=session.get(Student.class, tempStudent.getId());

            System.out.println("Get complete: "+myStudent);

            //commit transaction
            session.getTransaction().commit();

            System.out.println("done...!");
        }
        finally {
            factory.close();
        }
    }
}
