package com.luv2code.hibernate.demo;

import com.luv2code.hidernate.demo.entity.Instructor;
import com.luv2code.hidernate.demo.entity.instructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class aDeleteDemo {
    public static void main(String[] args) {
        //create session factory
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(instructorDetail.class).buildSessionFactory();

        //create new session
        Session session=factory.getCurrentSession();

        try {

            //create student object
            session.beginTransaction();

            //get instructor by primary key/id
            int theId=1;
            Instructor tempInstructor=session.get(Instructor.class,theId);

            System.out.println("Found "+tempInstructor);


            //delete instructor
            if(tempInstructor!=null){
                System.out.println("Deleting "+tempInstructor);

                session.delete(tempInstructor);
            }

            //commit transaction
            session.getTransaction().commit();
            System.out.println("done...!");
        }
        finally {
            factory.close();
        }
    }
}
