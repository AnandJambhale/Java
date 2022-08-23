package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.security.cert.Certificate;

public class eEmbedDemo {
    public static void main(String[] args) {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();

        Session session= factory.openSession();

        dCertificate certificate=new dCertificate("Android", "2Months");
        aStudent student=new aStudent(12,"Anand","Nagpur",certificate);

        Transaction tx=session.beginTransaction();

        session.save(student);

        tx.commit();

        session.close();
        factory.close();
    }



}
