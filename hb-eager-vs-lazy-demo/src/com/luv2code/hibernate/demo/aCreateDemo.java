package com.luv2code.hibernate.demo;

import com.luv2code.hidernate.demo.entity.Instructor;
import com.luv2code.hidernate.demo.entity.instructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class aCreateDemo {
    public static void main(String[] args) {
        //create session factory
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(instructorDetail.class).buildSessionFactory();

        //create new session
        Session session=factory.getCurrentSession();

        try {
            //create the object
//            instructor tempInstructor=new instructor("Anand", "Jmabhale","anandjmabhle21@gmaol.com");
//            instructorDetail tempInstructorDetail=new instructorDetail("http://luv2code.com","Luv to code");
            Instructor tempInstructor=new Instructor("Vilas", "Jambhale","vilasjambhale67@gmail.com");
            instructorDetail tempInstructorDetail=new instructorDetail("vilas","play Cricket");

            //associate the object
            tempInstructor.setInstructorDetail(tempInstructorDetail);

            //create student object
            session.beginTransaction();

            //start transaction
            //this will also save details object
            //bcoz of cascade type all
            System.out.println("Saving the instructor.....");
            session.save(tempInstructor);

            //commit transaction
            session.getTransaction().commit();
            System.out.println("done...!");
        }
        finally {
            factory.close();
        }
    }
}
