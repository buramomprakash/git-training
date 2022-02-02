package com.dxc.learning.libraryrestapp.controllers;

import java.time.LocalDate;
import java.util.List;

import com.dxc.learning.libraryrestapp.model.Book;
import com.dxc.learning.libraryrestapp.services.BookService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class Bookcontroller {

    @Autowired
    private BookService bookService;
    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
    @PostMapping("/books")
    public Book createBook(@RequestBody Book book){
        book.setPublicationDate(LocalDate.now());
        return bookService.createBook(book);
    }
    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable int id){
        return bookService.getBookById(id);
    }
    @PutMapping("bookss/{id}")
    public Book updateBook(@PathVariable Book book){
        return bookService.updateBook(book);
    }
    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable int id){
         bookService.deleteBook(id);
    }
}