package com.dxc.learning.libraryrestapp.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BookServiceimpl implements BookService {

    @Autowired
    private BookRepository bookRepository;
    @Override
    public Book getBookById(int id) {
        return bookRepository.findById(id).orElseThrow();
    }
    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }
    @Override
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }
    @Override
    public void deleteBook(int id) {
        Book book = getBookById(id);
        bookRepository.delete(book);
    }
    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    
}