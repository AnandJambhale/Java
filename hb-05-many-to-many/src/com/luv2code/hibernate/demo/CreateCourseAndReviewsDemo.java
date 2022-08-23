package com.luv2code.hibernate.demo;

import com.luv2code.hidernate.demo.entity.Course;
import com.luv2code.hidernate.demo.entity.Instructor;
import com.luv2code.hidernate.demo.entity.Review;
import com.luv2code.hidernate.demo.entity.instructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCourseAndReviewsDemo {
    public static void main(String[] args) {
        //create session factory
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(instructorDetail.class).addAnnotatedClass(Course.class).addAnnotatedClass(Review.class).buildSessionFactory();

        //create new session
        Session session=factory.getCurrentSession();

        try {
            //create student object
            session.beginTransaction();

            //create a course
            Course tempCourse=new Course("Pacman-How to score One millio  points");

            //add some reviews
            tempCourse.addReview(new Review("Great video"));
            tempCourse.addReview(new Review("Bad video"));
            tempCourse.addReview(new Review("I loved this"));

            //save the course.... and leverage the cascade all:-)
            System.out.println("saving the course");
            System.out.println(tempCourse);
            System.out.println(tempCourse.getReviews());

            session.save(tempCourse);

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