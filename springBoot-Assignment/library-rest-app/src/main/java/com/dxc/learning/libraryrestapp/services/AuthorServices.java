package com.dxc.learning.libraryrestapp.services;

import java.util.List;

import com.dxc.learning.libraryrestapp.model.Author;

public interface AuthorServices {

    public Author getAuthorById(int id);

    public Author getAuthorByemail(String name);

    public Author createAuthor(Author author);

    public Author updateAuthor(Author author);

    public void deleteAuthor(int id);

    public List<Author> getAllAuthors();
    
}
