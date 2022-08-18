package com.luv2code.hibernate.demo;

import com.luv2code.hidernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class aQueryStudentDemo {
    public static void main(String[] args) {
        //create session factory
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        //create new session
        Session session=factory.getCurrentSession();

        try {

            //create student object
            session.beginTransaction();

            //query student
            List<Student>theStudents=session.createQuery("from Student").list();

            //display student
            System.out.println(theStudents);

            //query student whose last name is jambhale
            theStudents=session.createQuery("from Student s where s.lastName='Jambhale'").list();

            //display the student
            System.out.println("\nstudent whose last name is jambhale ");
            System.out.println(theStudents);

            //query student" lastname=jambhale or first name=anand
            theStudents=session.createQuery("from Student s where s.lastName='Jambhale' OR s.firstName='Anand'").list();

            //display student
            System.out.println("\nstudent whose lastname=jambhale or first name=anand");
            System.out.println(theStudents);

            //query student email like anandjambhale21@GMAIL.COM
            theStudents=session.createQuery("from Student s where s.email LIKE 'anandjambhale21@gmail.com'").list();

            //display student
            System.out.println("\nstudent whose email like anandjambhale21@gmail.com");
            System.out.println(theStudents);

            //commit transaction
            session.getTransaction().commit();
            System.out.println("done...!");
        }
        finally {
            factory.close();
        }
    }
}
