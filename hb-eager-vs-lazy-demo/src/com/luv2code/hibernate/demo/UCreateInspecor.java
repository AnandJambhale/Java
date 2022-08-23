package com.luv2code.hibernate.demo;

import com.luv2code.hidernate.demo.entity.UInspector;
import com.luv2code.hidernate.demo.entity.UInspectorDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UCreateInspecor {
    public static void main(String[] args) {
        SessionFactory factory=new Configuration().configure().addAnnotatedClass(UInspector.class).addAnnotatedClass(UInspectorDetails.class).buildSessionFactory();

        Session session= factory.getCurrentSession();

        try {
            session.beginTransaction();

            UInspector uInspector=new UInspector("Anand", "Jambhale");
            UInspectorDetails inspectorDetails=new UInspectorDetails("Sp","nandanvan");

            uInspector.setuInspectorDetails(inspectorDetails);

            session.save(uInspector);

            session.getTransaction().commit();
        }
        finally {
            session.close();

            factory.close();
        }
    }
}
