//package com.book.demo.controllers;
//
//import com.book.demo.Entities.Book;
//import com.book.demo.Services.BookServices;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class BookController {
//
//    @Autowired
//    private BookServices bookServices;
//
//    //get all books
//    @GetMapping("/books")
//    public List<Book> getBooks(){
//        return this.bookServices.getAllBook();
//    }
//
//    //get book by id
//    @GetMapping("/book/{id}")
//    public Book getBook(@PathVariable("id") int id){
//        return this.bookServices.getBookById(id);
//    }
//
//    //to add book
//    @PostMapping("/books")
//    public Book addBook(@RequestBody Book book){
//        return this.bookServices.addBook(book);
//    }
//
//    //delete book handler
//    @DeleteMapping("book/{bookId}")
//    public void deleteBook(@PathVariable("bookId") int bookId){
//        this.bookServices.deleteBook(bookId);
//    }
//
//    //update book handler
//    @PutMapping("/book/{bookId}")
//    public Book updateBook(@RequestBody Book book ,@PathVariable("bookId") int bookId){
//        this.bookServices.updateBook(book,bookId);
//        return  book;
//    }
//}
