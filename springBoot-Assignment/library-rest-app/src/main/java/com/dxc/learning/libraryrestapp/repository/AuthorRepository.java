package com.dxc.learning.libraryrestapp.repository;

import com.dxc.learning.libraryrestapp.model.Author;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author , Integer> {
    
}
