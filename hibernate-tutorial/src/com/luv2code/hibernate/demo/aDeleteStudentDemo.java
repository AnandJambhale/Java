package com.luv2code.hibernate.demo;

import com.luv2code.hidernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class aDeleteStudentDemo {
    public static void main(String[] args) {
        //create session factory
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        //create new session
        Session session=factory.getCurrentSession();

        try {
            int studentId=1;

            //now get a new session and start transaction
            session=factory.getCurrentSession();
            session.beginTransaction();

            //retrieve the student based on id:primary key
            System.out.println("\nGetting student with id: "+studentId);

            Student myStudent=session.get(Student.class, studentId);


            //DELETE the student
//            System.out.println("Deleting student "+myStudent);
//            session.delete(myStudent);

            //delete student whose id is 2
            System.out.println("\nDeleting student whose id is 2");
            session.createQuery("delete from Student where id=2").executeUpdate();

            //commit transaction
            session.getTransaction().commit();

            System.out.println("DONE!!");
        }
        finally {
            factory.close();
        }
    }
}
