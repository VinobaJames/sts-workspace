package com.example.demo.pro3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bubble {
	@Value("${namevalue:restapi}")
public String name;
	@GetMapping("/dk")
public String hight()
{
	return"Welcome to "+name;
}
}
