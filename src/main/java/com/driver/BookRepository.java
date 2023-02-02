package com.driver;
import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

    List<Book> bookList;
    int id;
    public BookRepository(){
        bookList = new ArrayList<>();
        id =1;
    }

    public Book save(Book book){
        book.setId(id++);
        bookList.add(book);
        return book;
    }

    public Book findBookById(int id){
        if(!bookList.contains(id)){
            return null;
        }
        return bookList.get(id);
    }

    public List<Book> findAll(){
        return bookList;
    }

    public void deleteBookById(int id){
        bookList.remove(id);
    }

    public void deleteAll(){
        bookList.clear();
    }

    public List<Book> findBooksByAuthor(String author){
        List<Book> ansList = new ArrayList<>();
        for(Book book : bookList){
            if(book.getAuthor().equals((author))){
                ansList.add(book);
            }
        }
        return ansList;
    }

    public List<Book> findBooksByGenre(String genre){
        List<Book> ansList = new ArrayList<>();
        for(Book book : bookList){
            if(book.getGenre().equals((genre))){
                ansList.add(book);
            }
        }
        return ansList;
    }
}
