package com.dxc.learning.demoapp1.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Getter 
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "app_users")


public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)


    private Integer id;
    private String name;
    private String email;
    private String password;
    private LocalDate creationDate;


}
