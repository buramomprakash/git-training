package com.dxc.learning.personrestapi.controller;

import java.time.LocalDate;
import java.util.List;

import com.dxc.learning.personrestapi.model.Person;
import com.dxc.learning.personrestapi.service.PersonService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

   

    @Autowired
    private ModelMapper modelMapper;

      
    @GetMapping("/person")
    public List<Person> getAllPersons(){
        return personService.getAllPersons();
    }
    @PostMapping("/person")
    public Person createAuthor(@RequestBody Person person){
        person.setDob(LocalDate.now());
        return personService.createPerson(person);
    }
    @GetMapping("/person/{id}")
    public Person getAuthorById(@PathVariable int id){
        return personService.getPersonById(id);
    }
    @PutMapping("person/{id}")
    public Person updateAuthor(@PathVariable Person person){
        return personService.updatePerson(person);
    }
    @DeleteMapping("/person/{id}")
    public void deletePerson(@PathVariable int id){
         personService.deletePerson(id);
    }

    
}
