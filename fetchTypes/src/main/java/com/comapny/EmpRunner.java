package com.comapny;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class EmpRunner {
    public static void main(String[] args) {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();

        Session session=factory.openSession();

        Transaction tx= session.beginTransaction();

        Project project=new Project();
        project.setId(1);
        project.setProName("Java");

        Project project1=new Project();
        project1.setId(2);
        project1.setProName("Python");

        List<Project>projects=new ArrayList<>();
        projects.add(project);
        projects.add(project1);

        Emp emp=new Emp();
        emp.setId(1);
        emp.setName("Anand");
        emp.setProject(projects);

        session.save(emp);
        tx.commit();

        Emp emp1=(Emp) session.get(Emp.class,1);
        System.out.println(emp1);

        session.close();
        factory.close();
    }
}
