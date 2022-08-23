package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

public class App {
    public static void main(String[] args) throws IOException {
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        aStudent st=new aStudent(5, "Vilas", "Delhi");

        //address object
        bAddress address=new bAddress();
        address.setAddedDate(new Date());
        address.setCity("Delhi");
        address.setOpen(true);
        address.setStreet("Street1");

        //to save image in database
        FileInputStream fis=new FileInputStream("src/assets.jpg");
        byte[]data=new byte[fis.available()];
        fis.read(data);
        address.setImage(data);

        Session session= factory.openSession();

        session.beginTransaction();

        session.save(st);
        session.save(address);

        session.getTransaction().commit();

        session.close();

    }
}
