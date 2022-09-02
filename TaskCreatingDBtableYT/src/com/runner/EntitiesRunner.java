package com.runner;

import com.entities.Entities;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EntitiesRunner {
    public static void main(String[] args) {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();

        Session session=factory.openSession();

        Transaction tx=session.beginTransaction();

        Entities entities=new Entities(126,"America","machine",22574,85645,100000,500004,01,"yes",486,"generate",true,"ok","1.2.3",true,"long",2583l,15863l);
        Entities entities1=new Entities(148,"America","machine6",2745,7567,100000,500400,2420,"yes",486,"generate",true,"ok","1.7.3",false,"long1",283l,1563l);
        Entities entities2=new Entities(2568,"America","machine8",23589,5586,10000,500800,7520,"no",4286,"generate",true,"ok","1.8.3",false,"long2",253l,1583l);

        session.save(entities);
        session.save(entities1);
        session.save(entities2);

        tx.commit();

        session.close();
        factory.close();
    }
}
