package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class JasonApplication {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(JasonApplication.class, args);
		
		student stu=new student(53,"vino",30);
		ObjectMapper obj=new ObjectMapper();
		String str=obj.writeValueAsString(stu);
		System.out.print(str);
		
	
	
	
	
	}

}
