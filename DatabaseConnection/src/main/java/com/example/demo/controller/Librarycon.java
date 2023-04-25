package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.library;
import com.example.demo.service.Libraryser;
@RestController
public class Librarycon {
	@Autowired
	
	public Libraryser lser;
	@GetMapping("/login")
	public List <library> main(){
		return lser.main();
	}
	@PostMapping("/signin")
	public library sub(@RequestBody library h)
	{
		return lser.sub(h);
	}
	@PutMapping("/signup")
	public library dub(@RequestBody library h)
	{
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return lser.sub(h);
	}
	@DeleteMapping("/del/{Isno}")
    public void delect(@PathVariable("Isno") int Inso) {
		lser.del(Inso);
	}

}
 