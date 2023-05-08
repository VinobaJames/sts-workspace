package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.SignupRepository;
import com.example.demo.model.Signup;
    @Service
public class SignupService {
	@Autowired
	private SignupRepository sr;
	public List<Signup> getData() {
		
		return sr.findAll() ;
	}

	public void updateData(Signup sc) {
		sr.save(sc);
		
	}

	public void saveData(Signup sc) {
		sr.save(sc);
		
	}

	public void deleteData(int id) {
		sr.deleteById(id);
	
	}
}
