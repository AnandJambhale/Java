package com.luv2code.hibernate.demo;

import com.luv2code.hidernate.demo.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCourseAndStudentsDemo {
    public static void main(String[] args) {
        //create session factory
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(instructorDetail.class).addAnnotatedClass(Course.class).addAnnotatedClass(Student.class).addAnnotatedClass(Review.class).buildSessionFactory();

        //create new session
        Session session=factory.getCurrentSession();

        try {
            //create student object
            session.beginTransaction();

            //create a course
            Course tempCourse=new Course("Pacman-How to score One million  points");
            session.save(tempCourse);

            //create students
            Student tempStudent=new Student("Anand", "Jambahle", "anandjambhale@gmail.com");
            Student tempStudent1=new Student("Vilas", "Jambahle", "vilasjambhale@gmail.com");

            //add them to course
            tempCourse.addStudent(tempStudent);
            tempCourse.addStudent(tempStudent1);

            //save the students
            session.save(tempStudent);
            session.save(tempStudent1);

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