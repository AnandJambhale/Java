package com.luv2code.hibernate.demo;

import com.luv2code.hidernate.demo.entity.instructor;
import com.luv2code.hidernate.demo.entity.instructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteInstructorDetailDemo {
    public static void main(String[] args) {
        //create session factory
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(instructor.class).addAnnotatedClass(instructorDetail.class).buildSessionFactory();

        //create new session
        Session session=factory.getCurrentSession();

        try {

            //create student object
            session.beginTransaction();

            //get the instructor detail object
            int theId=3;
            instructorDetail tempInstructorDetail=session.get(instructorDetail.class,theId);

            //print detail
            System.out.println("tempInstructorDetail: "+tempInstructorDetail);

            //print associated instructor
            System.out.println("associated instructor: "+tempInstructorDetail.getInstructor());

            //now lwts delete instructor detail
            System.out.println("Deleting tempInstructorDetail: ");
            //remove the associate object reference
            //break bidirectional link

            tempInstructorDetail.getInstructor().setInstructorDetail(null);

            session.delete(tempInstructorDetail);

            //commit transaction
            session.getTransaction().commit();
            System.out.println("done...!");
        }
        catch (Exception exc){
            exc.printStackTrace();
        }
        finally {
            //handle leaking issue
            session.close();

            factory.close();
        }
    }
}
