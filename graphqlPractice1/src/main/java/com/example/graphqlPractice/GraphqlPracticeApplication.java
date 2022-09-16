package com.example.graphqlPractice;

import com.entities.Student;
import com.entities.Subjects;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class GraphqlPracticeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlPracticeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		SessionFactory factory=new Configuration().configure().buildSessionFactory();
//
//		Session session=factory.openSession();
//
//		Transaction tx= session.beginTransaction();
//		List <Student> stu=new ArrayList<>();
//		Student student=new Student();
//		student.setId(12);
//		student.setName("Anand");
//		stu.add(student);
//
//		Subjects subjects=new Subjects();
//		subjects.setId(1);
//		subjects.setSub_name("Hindi");
//		subjects.setStudent(stu);
//
//		session.save(student);
//		session.save(subjects);
//
//		tx.commit();
	}
}
