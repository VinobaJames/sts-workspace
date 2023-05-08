package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.LoginRepository;
import com.example.demo.model.Login;

@Service
public class LoginService { 
	@Autowired
	private LoginRepository LR;
	public List<Login> getByEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		return LR.getByEmailAndPassword(email, password);
	}
}
