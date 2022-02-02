package com.dxc.learning.libraryrestapp.controllers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.dxc.learning.libraryrestapp.model.Author;
import com.dxc.learning.libraryrestapp.services.AuthorServices;

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
@RequestMapping("/authors")
public class Authorcontroller {

    @Autowired
    private AuthorServices authorServices;

   

    @Autowired
    private ModelMapper modelMapper;

    
    @GetMapping("/authors")
    public List<Author> getAllAuthors(){
        return authorServices.getAllAuthors();
    }
    @PostMapping("/authors")
    public Author createAuthor(@RequestBody Author author){
        author.setCreationDate(LocalDate.now());
        return authorServices.createAuthor(author);
    }
    @GetMapping("/authors/{id}")
    public Author getAuthorById(@PathVariable int id){
        return authorServices.getAuthorById(id);
    }
    @PutMapping("authors/{id}")
    public Author updateAuthor(@PathVariable Author author){
        return authorServices.updateAuthor(author);
    }
    @DeleteMapping("/authors/{id}")
    public void deleteAuthor(@PathVariable int id){
         authorServices.deleteAuthor(id);
    }


}
