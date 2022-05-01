package com.api.book.bootrestbook.services;

import java.util.List;

import com.api.book.bootrestbook.dao.BookRepository;
import com.api.book.bootrestbook.entities.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookService {

    @Autowired
private BookRepository bookRepository;

    // private static List<Book> list = new ArrayList<>();

    // static{
    //     list.add(new Book(12, "java","xyz"));
    //     list.add(new Book(13,"c++","pqr"));
    //     list.add(new Book(14,"python","abc"));
    // }

    //get All books
    public List<Book> getAllBooks(){
       List<Book> list= (List<Book>)this.bookRepository.findAll();
        return list;
    }

    //get Single book
    public Book getBookById(int id){

        Book book =null;
        try{
            // book=list.stream().filter(e->e.getId()==id).findFirst().get();
          book=  this.bookRepository.findById(id);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return book;
    }

    //put mapping
    public Book addBook(Book b){
        Book res= bookRepository.save(b);
        return res;
    }

    //delete mapping
    public void deleteBook(int id){
        // Book book=null;
        // book=list.stream().filter(e->e.getId()==id).findFirst().get();
        // list.remove(book);
        bookRepository.deleteById(id);

    }

    //update mapping
    public void updateBook(Book book, int id){
        
        // list= list.stream().map(b->{
        
        //     if(b.getId()==id){
        //         b.setTitle(book.getTitle());
        //         b.setAuthor(book.getAuthor());
        //     }
        //     return b;
        // }).collect(Collectors.toList());
            book.setId(id);
        bookRepository.save(book);
        

    }
}
