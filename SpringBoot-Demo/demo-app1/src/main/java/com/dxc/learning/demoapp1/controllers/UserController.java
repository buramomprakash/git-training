package com.dxc.learning.demoapp1.controllers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.dxc.learning.demoapp1.model.User;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/users")
public class UserController {
    private static List<User> users=new ArrayList();
    @GetMapping({"","/"})
    public ResponseEntity<List<User>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(users);

    }

    @PostMapping({"","/"})
    public ResponseEntity<User> create(@RequestBody User user){
        user.setCreationDate(LocalDate.now());
        users.add(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
    
}
