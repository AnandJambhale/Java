package com.luv2code.hibernate.demo;

import com.luv2code.hidernate.demo.entity.QAnswer;
import com.luv2code.hidernate.demo.entity.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QueAns {
    public static void main(String[] args) {
        SessionFactory factory=new Configuration().configure().addAnnotatedClass(Question.class).addAnnotatedClass(QAnswer.class).buildSessionFactory();

        Session session= factory.getCurrentSession();

        try {
            session.beginTransaction();

            QAnswer answer=new QAnswer("Its a programming language");
            Question q1=new Question("What is java?", answer);

            session.save(q1);

            session.getTransaction().commit();
        }
        finally {
            session.close();
            factory.close();
        }
    }
}
