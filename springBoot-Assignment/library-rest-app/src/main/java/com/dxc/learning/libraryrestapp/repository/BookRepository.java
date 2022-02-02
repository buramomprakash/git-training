package com.dxc.learning.libraryrestapp.repository;

import com.dxc.learning.libraryrestapp.model.Author;
import com.dxc.learning.libraryrestapp.model.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book , Integer> {
    
}
