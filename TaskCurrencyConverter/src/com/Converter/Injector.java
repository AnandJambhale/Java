package com.Converter;

import com.Currencies.CurrencyValues;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Injector {
    public static void main(String[] args) {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();

        Session session=factory.openSession();

        Transaction tx=session.beginTransaction();

        CurrencyValues values5=new CurrencyValues(156,"China",0.087);
        CurrencyValues value6=new CurrencyValues(392,"Japan",1.76);
        CurrencyValues value2=new CurrencyValues(586,"Pakistan",2.76);
        CurrencyValues value3=new CurrencyValues(144,"Sri Lanka",4.54);
        CurrencyValues value4=new CurrencyValues(554,"New Zealand",0.021);

        session.save(values5);
        session.save(value6);
        session.save(value2);
        session.save(value3);
        session.save(value4);

        tx.commit();

        session.close();
        factory.close();
    }
}
