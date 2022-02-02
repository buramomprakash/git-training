package com.dxc.learning.libraryrestapp.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class AuthorDto {

    
    private String name;
    private String email;
    //private LocalDate creationDate;
}
