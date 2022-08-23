package com.luv2code.hibernate.demo;

import com.luv2code.hidernate.demo.entity.UCrimes;
import com.luv2code.hidernate.demo.entity.UInspector;
import com.luv2code.hidernate.demo.entity.UInspectorDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UCreateCrimes {
    public static void main(String[] args) {
        SessionFactory factory=new Configuration().configure().addAnnotatedClass(UCrimes.class).addAnnotatedClass(UInspector.class).addAnnotatedClass(UInspectorDetails.class).buildSessionFactory();

        Session session= factory.getCurrentSession();

        try {

            session.beginTransaction();


            UInspector inspector=session.get(UInspector.class,1);

            UCrimes crimes=session.get(UCrimes.class, 10);
//            UCrimes crimes1=new UCrimes("Stole Wallet");
//
//            inspector.add(crimes);
//            inspector.add(crimes1);

            session.delete(crimes);
//            session.save(crimes1);


            session.getTransaction().commit();
        }
        finally {
            session.close();

            factory.close();
        }
    }
}
