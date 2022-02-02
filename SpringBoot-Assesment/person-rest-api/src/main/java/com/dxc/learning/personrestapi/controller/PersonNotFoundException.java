package com.dxc.learning.personrestapi.controller;

public class PersonNotFoundException extends RuntimeException{
    PersonNotFoundException(Integer id){
        super("could not find person" +id);
    }
    
}
