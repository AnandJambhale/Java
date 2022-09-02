package com.runner;

import com.entities.Audit;
import com.entities.Entities;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AuditRunner {
    public static void main(String[] args) {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();

        Session session=factory.openSession();

        Transaction tx=session.beginTransaction();

        Audit audit=new Audit(12,"America","machine",225,856,10000,50000,201,"yes",486,"generate",true,"ok","1.2.3",true,"long",2583l,15863l);
        Audit audit1=new Audit(14,"America","machie1",24,756,1000000,50000,2205,"yes",4856,"generated",false,"ok","1.7.3",false,"long1",283l,1563l);
        Audit audit2=new Audit(256,"America","machine2",239,56,1000000,5000,7820,"yes",486,"generate",false,"ok","1.8.3",true,"long2",253l,1583l);

        session.save(audit);
        session.save(audit1);
        session.save(audit2);

        tx.commit();

        session.close();
        factory.close();
    }
}
