package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.library;
import com.example.demo.repository.libraryrepo;
@Service
public class Libraryser {
	@Autowired
	libraryrepo li;
	public List <library> main(){
		return li.findAll() ;
	}
	public library sub(library h)
	{
		return li.save(h);
	}
	public library dub(library h)
	{
		return li.save(h);

	}
	public void del(int Isno)
	{
		li.deleteById(Isno);
		
	}
}
