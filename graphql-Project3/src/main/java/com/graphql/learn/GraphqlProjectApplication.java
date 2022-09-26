package com.graphql.learn;

import com.graphql.learn.entities.Book;
import com.graphql.learn.entities.Student;
import com.graphql.learn.entities.Subjects;
import com.graphql.learn.services.BookService;
import com.graphql.learn.services.StudentService;
import com.graphql.learn.services.impl.SubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlProjectApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;

	@Autowired
	private StudentService studentService;

	@Autowired
	private SubjectsService subjectsService;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Book book=new Book(1,"complete reference","for learning java","Jay",5000,2000,new Student(25,"Anand"));
//		Book book1=new Book(2,"complete reference","for learning python","Joe",5000,2000,new Student(47,"Vijay"));
//		Book book2=new Book(3,"complete reference","for learning c++","Divya",5000,2000,new Student(89,"Hansuja"));
//
//		this.studentService.createStudent(book.getStudent());
//		this.studentService.createStudent(book1.getStudent());
//		this.studentService.createStudent(book2.getStudent());
//		this.bookService.create(book);
//		this.bookService.create(book1);
//		this.bookService.create(book2);

		Subjects subjects=new Subjects();
		subjects.setId(2);
		subjects.setName("Hindi");

		Student student=new Student(1,"Anand",subjects);

		this.studentService.createStudent(student);
//		this.subjectsService.createSub(subjects);
	}
}
