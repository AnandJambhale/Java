package com.luv2code.hibernate.demo;

import com.luv2code.hidernate.demo.entity.Course;
import com.luv2code.hidernate.demo.entity.Instructor;
import com.luv2code.hidernate.demo.entity.instructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EagerLazyDemo {
    public static void main(String[] args) {
        //create session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(instructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();

        //create new session
        Session session = factory.getCurrentSession();

        try {
            //create student object
            session.beginTransaction();

            //get the instructor from db
            int theId = 1;
            Instructor tempInstructor = session.get(Instructor.class, theId);
            System.out.println("luv2code: Instructor: " + tempInstructor);

            System.out.println("luv2code: Courses: " + tempInstructor.getCourses());

            session.getTransaction().commit();

            //close the session
            session.close();

            System.out.println("session is now closed");

            //get course for the instructor
            System.out.println("luv2code: Courses: " + tempInstructor.getCourses());

            //commit transaction

            System.out.println("luv2code: Done...!");
        } finally {
            //add clean up code
            session.close();

            factory.close();
        }
    }
}