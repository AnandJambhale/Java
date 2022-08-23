package com.luv2code.hibernate.demo;

import com.luv2code.hidernate.demo.entity.Course;
import com.luv2code.hidernate.demo.entity.Instructor;
import com.luv2code.hidernate.demo.entity.instructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchJoinDemo {
    public static void main(String[] args) {
        //create session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(instructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();

        //create new session
        Session session = factory.getCurrentSession();

        try {
            //start the session
            session.beginTransaction();

            //option 2: Hibernate query with hql

            //get the instructor from db
            int theId=1;
            Query<Instructor>query=session.createQuery("select i from Instructor i "+"JOIN FETCH i.courses "+"where i.id=:theInstructorId", Instructor.class);

            //set parameter on query
            query.setParameter("theInstructorId",theId);

            //execute query
            Instructor tempInstructor=query.getSingleResult();
            System.out.println("luv2code: Instructor: " + tempInstructor);

            //commit transaction
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