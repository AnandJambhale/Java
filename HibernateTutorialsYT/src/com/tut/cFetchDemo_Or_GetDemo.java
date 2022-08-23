package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class cFetchDemo_Or_GetDemo {
    public static void main(String[] args) {

        //if u states to find object of id 1 in get() ans 1 is not in database then then get() will return null
        //whereas load() return exception

        //use get if u are not sure if database has that value

        //if object is made then get() load that data even when not called whereas load() load it only when used

        SessionFactory factory= new Configuration().configure().buildSessionFactory();
        Session session=factory.openSession();

//        aStudent astudent=session.get(aStudent.class, 5);
        aStudent astudent=session.load(aStudent.class, 5);  //u can also use load in place of get
        System.out.println(astudent);

//        bAddress address=session.load(bAddress.class,6);
        bAddress address=session.get(bAddress.class,6);
        System.out.println(address);

        session.close();
        factory.close();
    }
}
