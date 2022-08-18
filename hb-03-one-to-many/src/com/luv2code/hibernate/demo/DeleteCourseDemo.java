package com.luv2code.hibernate.demo;

import com.luv2code.hidernate.demo.entity.Course;
import com.luv2code.hidernate.demo.entity.Instructor;
import com.luv2code.hidernate.demo.entity.instructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteCourseDemo {
    public static void main(String[] args) {
        //create session factory
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(instructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();

        //create new session
        Session session=factory.getCurrentSession();

        try {
            //create student object
            session.beginTransaction();

            //get the course
            int id=10;
            Course tempCourse=session.get(Course.class,id);

            //delete course
            session.delete(tempCourse);

            //commit transaction
            session.getTransaction().commit();
            System.out.println("Done...!");
        }
        finally {
            //add clean up code
            session.close();

            factory.close();
        }
    }
}