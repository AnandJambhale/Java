package com.graphql.learn.controllers;

import com.graphql.learn.entities.Book;
import com.graphql.learn.entities.Student;
import com.graphql.learn.services.BookService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.OneToOne;
import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    //getAll
    @QueryMapping("allBooks")
    public List<Book> getAll(){
        return this.bookService.getAll();
    }

    //get single
    @QueryMapping("getBook")
    public Book get(@Argument int bookId){
        return this.bookService.get(bookId);
    }

    //create
    @MutationMapping("createBook")
    public Book create(@Argument BookInput book){
        Book b=new Book();
        b.setTitle(book.getTitle());
        b.setDescription(book.getDescription());
        b.setPrice(book.getPrice());
        b.setPages(book.getPages());
        b.setAuthor(book.getAuthor());
        b.setStudent(book.getStudent());
        return this.bookService.create(b);
    }
}

@Getter
@Setter
class BookInput{
    private String title;
    private String description;
    private String author;
    private int price;
    private int pages;

    @OneToOne
    private Student student;
}
