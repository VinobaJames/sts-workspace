package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
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
	public List<library>sortlibrary(String field){
		//return met.findAll(Sort.by(field));
		return li.findAll(Sort.by(Direction.DESC,field));
	}
	//paging
	public  List<library>paginglib(int offset,int pageSize){
		PageRequest paging=PageRequest.of(offset,pageSize);
		Page<library> obj=li.findAll(paging);
		List<library>sc=obj.getContent();
		return sc;
	}
	//pagination without getcontent()
	public  Page<library> pageablelib(int offset,int pageSize){
		PageRequest paging=PageRequest.of(offset,pageSize);
		Page<library> obj=li.findAll(paging);
		return obj;
	}
	//pagination with sorting
	public  List<library>paginglib(int offset,int pageSize,String field){
		PageRequest paging=PageRequest.of(offset,pageSize).withSort(Sort.by(field));
		Page<library> obj=li.findAll(paging);
		List<library>sc=obj.getContent();
		return sc;
	}
	
}
