package com.map1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MappingDemo {
    public static void main(String[] args) {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();

        Session session= factory.openSession();

        Project project1=new Project(25,"Python");
        Project project2=new Project(26,"java");
        List<Project>projects=new ArrayList<>(List.of(project1,project2));

        Emp emp=new Emp(12,"Anandi",projects);
        Emp emp1=new Emp(16,"Anando",projects);
        Emp emp2=new Emp(17,"Anandu",projects);
        List<Emp>emps=new ArrayList<>(List.of(emp,emp1,emp2));
        project1.setEmps(emps);
        project2.setEmps(emps);

        session.beginTransaction();

        Transaction tx= session.getTransaction();
        session.save(emp);
        session.save(emp1);
        session.save(emp2);
        session.save(project1);
        session.save(project2);

        tx.commit();

        Emp emp3=session.load(Emp.class, 12);
        System.out.println(emp3.getProjects().size());

        session.close();
        factory.close();
    }
}
