package com.trial;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Runner {
    public static void main(String[] args) {

        SessionFactory factory=new Configuration().configure("com\\trial\\hibernate.cfg1.xml").buildSessionFactory();

        Session session=factory.openSession();

        Transaction tx= session.beginTransaction();;
        Student student=new Student(1,"Vijay");

        Subjects subjects=new Subjects(1,"Hindi");
        Subjects subjects1=new Subjects(2,"Marathi");

        List<Subjects> subjects2=List.of(subjects1,subjects);

        student.setSubjects(subjects2);

        session.save(student);
        session.save(subjects);

        tx.commit();

        session.close();
        factory.close();
    }
}
