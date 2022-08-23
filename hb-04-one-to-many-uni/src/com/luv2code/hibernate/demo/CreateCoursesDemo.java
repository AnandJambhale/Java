package com.luv2code.hibernate.demo;

import com.luv2code.hidernate.demo.entity.Course;
import com.luv2code.hidernate.demo.entity.Instructor;
import com.luv2code.hidernate.demo.entity.instructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCoursesDemo {
    public static void main(String[] args) {
        //create session factory
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(instructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();

        //create new session
        Session session=factory.getCurrentSession();

        try {
            //create student object
            session.beginTransaction();

            //get the instructor from db
            int theId=1;
            Instructor tempInstructor=session.get(Instructor.class,theId);

            //create some course
            Course tempCourse1=new Course("Air Guitar-Ultimate guide");
            Course tempCourse2=new Course("The pinball masterclass");

            //add course to instructor
            tempInstructor.add(tempCourse1);
            tempInstructor.add(tempCourse2);

            //save the course
            session.save(tempCourse1);
            session.save(tempCourse2);

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