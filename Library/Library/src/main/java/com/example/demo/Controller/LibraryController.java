package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.LibraryService;
import com.example.demo.model.Library;

@RestController
@RequestMapping
public class LibraryController {
	  @Autowired
	  LibraryService libraryService;
	
	@GetMapping("/get")
	public List<Library> getDetails()
	{
		return libraryService.getDetails();
	}
	@DeleteMapping("/delete/{id}")
	public String deleteDetails(@PathVariable("id") Long id) {
		return libraryService.deleteDetails(id);
	}

	@PostMapping("/post")
	public Library postDetails(@RequestBody Library x)
	{
		return libraryService.postDetails(x);
	}
	
	@PutMapping("/put/{id}")
	public Library updateCourseDetails(@RequestBody Library x)
	{
		return libraryService.updateCourseDetails(x);
	}

}
