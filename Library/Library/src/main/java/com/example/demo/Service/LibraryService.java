package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.LibraryRepository;
import com.example.demo.model.Library;

@Service
public class LibraryService {
	@Autowired
	LibraryRepository libraryRepository;
	
	public List<Library> getDetails()
	{
		return libraryRepository.findAll();
	}
	public String deleteDetails(Long id)
	{
		libraryRepository.deleteById(id);
		return "Id : "+id+" is deleted";
	}
	public Library postDetails(Library z)
	{
		return libraryRepository.save(z);
	}
	public Library updateCourseDetails(Library x)
	{
		return libraryRepository.save(x);
	}

}
