package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;
@Service
public class UserService {

	@Autowired
	UserRepository us;
public UserModel saveUser(UserModel u)
{
 return us.save(u);

}
public String validateUser(String username,String password)
{
	String result="";
	UserModel u=us.findByUsername(username);
	if(u==null)
	{
		result="Invalid user";
	}
		else
			
		{
			if(u.getPassword().equals(password))
			{
				result="Login success";
			}
			else
			{
				result="Login failed";
			}
		}
	return result;
}
}
