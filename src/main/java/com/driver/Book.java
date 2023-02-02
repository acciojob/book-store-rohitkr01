package com.driver;

public class Book {
    
     private int id;

     private String name;

     private String genre;
     
     private String author;

     public Book(){
          this.id = id;
          this.name = name;
          this.genre = genre;
          this.author = author;
     }

     public int getId() {
          return id;
     }

     public String getName() {
          return name;
     }

     public String getGenre() {
          return genre;
     }

     public String getAuthor() {
          return author;
     }

     public void setId(int id) {
          this.id = id;
     }

     public void setName(String name) {
          this.name = name;
     }

     public void setGenre(String genre) {
          this.genre = genre;
     }

     public void setAuthor(String author) {
          this.author = author;
     }
}
