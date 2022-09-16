package com.graphql.learn.services.impl;

import com.graphql.learn.entities.Book;
import com.graphql.learn.repositories.BookRep;
import com.graphql.learn.repositories.StudentRep;
import com.graphql.learn.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRep bookRep;

    @Autowired
    private StudentRep studentRep;

    @Autowired
    public BookServiceImpl(BookRep bookRep) {
        this.bookRep = bookRep;
    }

    @Override
    public Book create(Book book) {
        this.studentRep.save(book.getStudent());
        return this.bookRep.save(book);
    }

    @Override
    public List<Book> getAll() {
        return bookRep.findAll();
    }

    @Override
    public Book get(int bookId) {
        return this.bookRep.findById(bookId).orElseThrow(()->new RuntimeException("Book you are looking is not in database"));
    }
}
