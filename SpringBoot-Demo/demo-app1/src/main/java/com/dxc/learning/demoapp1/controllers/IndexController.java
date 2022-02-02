package com.dxc.learning.demoapp1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("/hello")

    public String hello(){
        return "Hello from rockstar";

    }
    
    @GetMapping("/hello/{name}")
    public String helloMobile(@PathVariable String name){
        return "Hello from rockstar " +name;
    }
    

    @GetMapping("/add/{n1}/{n2}")
    public String add(@PathVariable int n1,@PathVariable int n2){
        return "the sum is : "+ (n1+n2);

    }
}
