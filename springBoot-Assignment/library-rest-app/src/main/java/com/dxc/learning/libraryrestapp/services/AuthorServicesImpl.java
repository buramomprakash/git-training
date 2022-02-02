package com.dxc.learning.libraryrestapp.services;

import java.util.List;

import com.dxc.learning.libraryrestapp.model.Author;
import com.dxc.learning.libraryrestapp.repository.AuthorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServicesImpl implements AuthorServices{
     @Autowired
    private AuthorRepository authorRepository;

      
   
    @Override
    public Author getAuthorById(int id) {
        return authorRepository.findById(id).orElseThrow();
    }
    @Override
    public Author createAuthor(Author author) {
        return authorRepository.save(author);
    }
    @Override
    public Author updateAuthor(Author author) {
        return authorRepository.save(author);
    }
    @Override
    public void deleteAuthor(int id) {
        Author author = getAuthorById(id);
        authorRepository.delete(author);
    }
    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }
    @Override
    public Author getAuthorByemail(String name) {
        
        return null;
    }
    
    

    
}
