package com.dxc.learning.personrestapi.service;

import java.util.List;

import com.dxc.learning.personrestapi.model.Person;
import com.dxc.learning.personrestapi.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    


    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person getPersonById(int id) {
        return personRepository.findById(id).orElseThrow();
    }

    @Override
    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person updatePerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public void deletePerson(int id) {
        Person person = getPersonById(id);
        personRepository.delete(person);
    }

    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    /*@Override
    public Person getPersonByemail(String name) {
        
        return null;
    }


    @Override
    public Person getPersonByaddress(String addressString) {
        // TODO Auto-generated method stub
        return null;
    }*/

   


    

  
}
