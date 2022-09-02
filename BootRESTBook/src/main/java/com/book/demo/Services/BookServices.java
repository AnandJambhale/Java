//package com.book.demo.Services;
//
//import com.book.demo.Entities.Book;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Component
//public class BookServices {
//    private static List<Book> list=new ArrayList<>();
//
//    static {
//        list.add(new Book(123,"Java complete Course","Anand"));
//        list.add(new Book(12,"Python complete Course","Vijay"));
//        list.add(new Book(152,"C++ complete Course","Durgesh"));
//    }
//
//    //get all book
//    public List<Book> getAllBook() {
//        return list;
//    }
//
//    //get single book
//    public Book getBookById(int id){
//        Book book=null;
//        try {
//            book=list.stream().filter(e->e.getId()==id).findFirst().get();
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        return book;
//    }
//
//    //to add book
//    public Book addBook(Book b){
//        list.add(b);
//        return b;
//    }
//
//    //to delete book
//    public void deleteBook(int bId){
//        Book book=list.stream().filter(e->e.getId()==bId).findFirst().get();
//        list.remove(book);
//    }
//
//    //update book
////    public void updateBook(Book book, int BookId){
////        list=list.stream().map(b->{
////            if (b.getId()==BookId){
////                b.setTitle(book.getTitle());
////                b.setAuthor(book.getAuthor());
////            }
////            return b;
////        }).collect(Collectors.toList());
////    }
//    public void updateBook(Book book, int BookId){
//        Book b=list.stream().filter(e->e.getId()==BookId).findFirst().get();
//        b.setTitle(book.getTitle());
//        b.setAuthor(book.getAuthor());
//    }
//}
