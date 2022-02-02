package com.dxc.learning.personrestapi.repository;

import com.dxc.learning.personrestapi.model.Person;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person , Integer>{
    
}
