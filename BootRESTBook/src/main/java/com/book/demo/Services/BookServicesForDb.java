package com.book.demo.Services;

import com.book.demo.Entities.Book;
import com.book.demo.dao.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookServicesForDb {

    @Autowired
    private BookRepository bookRepository;

//    private static List<Book> list=new ArrayList<>();
//
//    static {
//        list.add(new Book(123,"Java complete Course","Anand"));
//        list.add(new Book(12,"Python complete Course","Vijay"));
//        list.add(new Book(152,"C++ complete Course","Durgesh"));
//    }

    //get all book
    public List<Book> getAllBook() {
        List<Book> list=(List<Book>) this.bookRepository.findAll();
        return list;
    }

    //get single book
    public Book getBookById(int id){
        Book book=null;
        try {
//            book=list.stream().filter(e->e.getId()==id).findFirst().get();
            book=this.bookRepository.findById(id);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return book;
    }

    //to add book
    public Book addBook(Book b){
        Book result=bookRepository.save(b);
        return result;
    }

    //to delete book
    public void deleteBook(int bId){
//        Book book=list.stream().filter(e->e.getId()==bId).findFirst().get();
//        list.remove(book);
        bookRepository.deleteById(bId);
    }

    //update book
//    public void updateBook(Book book, int BookId){
//        list=list.stream().map(b->{
//            if (b.getId()==BookId){
//                b.setTitle(book.getTitle());
//                b.setAuthor(book.getAuthor());
//            }
//            return b;
//        }).collect(Collectors.toList());
//    }
    public void updateBook(Book book, int BookId){
//        Book b=list.stream().filter(e->e.getId()==BookId).findFirst().get();
//        b.setTitle(book.getTitle());
//        b.setAuthor(book.getAuthor());
        book.setId(BookId);
        bookRepository.save(book);
    }
}
