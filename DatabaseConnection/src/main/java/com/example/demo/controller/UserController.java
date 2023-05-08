package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;

@RestController

public class UserController {

	@Autowired
	UserService usr;
	@PostMapping("/checkLogin")
	public String validateUser(@RequestBody UserModel u)
		{
		System.out.println(u.getUsername());
			return usr.validateUser(u.getUsername(),u.getPassword());
		}
	@PostMapping("/addUser")
	public UserModel main(@RequestBody UserModel u)
	{
	return usr.saveUser(u);
	}
	}
