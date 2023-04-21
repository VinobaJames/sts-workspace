package com.example.demo.pro2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sky {
	public String name="Power";
	@RequestMapping("/max")
	public String hello()
	{
		return "Hi "+name;
	}

}
