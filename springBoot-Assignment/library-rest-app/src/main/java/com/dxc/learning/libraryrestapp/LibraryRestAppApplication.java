package com.dxc.learning.libraryrestapp;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraryRestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryRestAppApplication.class, args);
	}
    @Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
