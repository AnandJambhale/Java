package com.graphql.learn;

import com.graphql.learn.entities.Book;
import com.graphql.learn.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlProjectApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;
	public static void main(String[] args) {
		SpringApplication.run(GraphqlProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book book=new Book(1,"complete reference","for learning java","Jay",5000,2000);
		Book book1=new Book(2,"complete reference","for learning python","Joe",5000,2000);
		Book book2=new Book(3,"complete reference","for learning c++","Divya",5000,2000);

		this.bookService.create(book);
		this.bookService.create(book1);
		this.bookService.create(book2);
	}
}
