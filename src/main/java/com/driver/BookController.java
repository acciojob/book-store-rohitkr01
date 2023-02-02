package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("books")
public class BookController {
    @Autowired
    BookService bookService;

    // One example controller, make the rest by yourself
    @PostMapping("/create-book")
    public ResponseEntity createBook(@RequestBody Book book){
        Book newbook = bookService.createBook(book);
        return new ResponseEntity<>(newbook, HttpStatus.CREATED);
    }

    @GetMapping("/get-book-by-id/{id}")
    public ResponseEntity findBookById(@PathVariable("id") String id){
        Book response = bookService.findBookById(id);
        return new ResponseEntity(response, HttpStatus.FOUND);
    }

    @DeleteMapping("/delete-book-by-id/{id}")
    public ResponseEntity deleteBookById(@PathVariable("id") String id){
        bookService.deleteBookById(id);
        return new ResponseEntity("Deleted book with the id"+ id, HttpStatus.OK);
    }

    @GetMapping("/get-all-books")
    public ResponseEntity findAllBooks(){
        return new ResponseEntity(bookService.findAllBooks(),HttpStatus.OK);
    }

    @DeleteMapping("/delete-all-books")
    public ResponseEntity deleteAllBooks(){
        bookService.deleteAllBooks();
        return new ResponseEntity("Deleted all Books successfully",HttpStatus.OK);
    }

    @GetMapping("/get-books-by-author")
    public ResponseEntity findBooksByAuthor(@RequestParam("author") String author){
        List<Book> response =  bookService.findBooksByAuthor(author);
        return new ResponseEntity(response,HttpStatus.OK);
    }

    @GetMapping("/get-books-by-genre")
    public ResponseEntity findBooksByGenre(@RequestParam("genre") String genre){
        List<Book> response =  bookService.findBooksByGenre(genre);
        return new ResponseEntity(response,HttpStatus.OK);
    }

}
