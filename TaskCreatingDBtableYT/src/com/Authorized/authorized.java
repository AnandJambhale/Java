package com.Authorized;

import com.entities.Audit;
import com.entities.Entities;
import com.entities.Main;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.*;

public class authorized {
    public static void main(String[] args) throws SQLException {
        SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session= factory.openSession();
        Transaction tx= session.beginTransaction();

        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/task","root","Hansuja12#");

        Statement st=con.createStatement();
        ResultSet rs= st.executeQuery("select * from entities");

        while (rs.next()){
            int countryCode=rs.getInt("countryCode");

            Entities entities=session.get(Entities.class, countryCode);
            System.out.println(entities);


            if (entities.isAuthorized()){
                Main main=new Main();
                main.setEntities(entities);
                session.save(main);
            }
        }
        Statement st1=con.createStatement();
        ResultSet rs1= st1.executeQuery("select * from audit");

        while (rs1.next()){
            int countryCode=rs1.getInt("countryCode");

            Audit audit=session.get(Audit.class, countryCode);
            System.out.println(audit);


            if (audit.isAuthorized()){
                Main main=new Main();
                main.setAudit(audit);
                session.save(main);
            }
        }
        tx.commit();
        session.close();
        factory.close();
    }
}
