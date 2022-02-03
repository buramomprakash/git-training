package com.dxc.learning.personrestapi.dto;


import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class PersonDto {
    
    @NotBlank(message="User Id is Mandatory")
    private Integer id;
    
    @NotBlank(message="User Name is Mandatory")
    private String name;
    
    @NotBlank(message="Local Date is Mandatory")
    private LocalDate dob;
    
    @NotBlank(message="Address is Mandatory")
    private String address;
    
    @NotBlank(message="Email is Mandatory")
    private String email;
}
