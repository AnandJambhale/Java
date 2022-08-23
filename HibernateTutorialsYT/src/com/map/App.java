package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();

        Answer ans=new Answer(422, "It is a programming language");
        Answer ans1=new Answer(42, "With help of this we can create softwares");
        Answer ans2=new Answer(432, "Java has different type of framework");
        List<Answer>answers=new ArrayList<>();
        answers.add(ans);
        answers.add(ans1);
        answers.add(ans2);
        QuestionsOneToMany que=new QuestionsOneToMany(12, "What is java", answers);

        ans.setQuestion(que);
        ans1.setQuestion(que);
        ans2.setQuestion(que);

        que.setAnswers(answers);

        //saving in db
        Session session= factory.openSession();

        Transaction tx= session.beginTransaction();
        session.save(que);

        tx.commit();

        //fetching
        QuestionsOneToMany que1=session.get(QuestionsOneToMany.class, 12);
        System.out.println(que1);
        System.out.println(que1.getAnswers().size());

        session.close();
        factory.close();
    }
}
