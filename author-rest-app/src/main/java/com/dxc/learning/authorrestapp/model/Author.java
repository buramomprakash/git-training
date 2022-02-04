package com.dxc.learning.authorrestapp.model;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name ="Authors")

public class Author {
    

    private Integer id;

    private String name;

    private LocalDate dob;

    private String address;

    private String email;
    
    private List<String> genre;
    
}
