//package com.book.demo.controllers;
//
//import com.book.demo.Entities.Book;
//import com.book.demo.Services.BookServicesForDb;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//public class BookController1 {
//
//    @Autowired
//    private BookServicesForDb bookServices;
//
//    //get all books
//    @GetMapping("/books")
//    public ResponseEntity<List<Book>> getBooks(){
//        List<Book> list=bookServices.getAllBook();
//        if (list.size()==0){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//        }
//        return ResponseEntity.status(HttpStatus.CREATED).body(list);
//    }
//
//    //get book by id
//    @GetMapping("/book/{id}")
//    public ResponseEntity<Book> getBook(@PathVariable("id") int id){
//        Book book= this.bookServices.getBookById(id);
//        if (book==null){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//        }
//        return ResponseEntity.of(Optional.of(book));
//    }
//
//    //to add book
//    @PostMapping("/books")
//    public ResponseEntity<Book> addBook(@RequestBody Book book){
//        Book b=null;
//        try {
//            b=this.bookServices.addBook(book);
//            return ResponseEntity.of(Optional.of(b));
//        }
//        catch (Exception e){
//            e.printStackTrace();
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//        }
//    }
//
//    //delete book handler
//    @DeleteMapping("book/{bookId}")
//    public ResponseEntity<Void> deleteBook(@PathVariable("bookId") int bookId){
//
//        try {
//            this.bookServices.deleteBook(bookId);
//            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//        }
//        catch (Exception e){
//            e.printStackTrace();
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//        }
//    }
//
//    //update book handler
//    @PutMapping("/book/{bookId}")
//    public ResponseEntity<Book> updateBook(@RequestBody Book book ,@PathVariable("bookId") int bookId){
//        try {
//            this.bookServices.updateBook(book,bookId);
//            return ResponseEntity.ok().body(book);
//        }
//        catch (Exception e){
//            e.printStackTrace();
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//        }
//    }
//}
