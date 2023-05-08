package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	public String deleteDetails(int id)
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
	
	public List<Library> sortStudent(String field) {
		return libraryRepository.findAll(Sort.by(field));
	}
	public List<Library> sortStudentdesc(String field) {
		return libraryRepository.findAll(Sort.by(Direction.DESC,field));
	}
	
	public List<Library>pageStudent( int offset, int pagesize )
	{
		Page<Library> paging=libraryRepository.findAll(PageRequest.of(offset, pagesize));
	    return paging.getContent();
	}
	
	public List<Library> sortpage(int offset,int pagesize,String field)
	{
		Pageable paging=PageRequest.of(offset, pagesize).withSort(Sort.by(field));
		Page<Library> page=libraryRepository.findAll(paging);
		return page.getContent();
				
	}
	 public Optional<Library>get(int id)
	    {
	    	return libraryRepository.findById(id);
	    }
     
	 
	 public Library saveAuthor(Library a) {
			return libraryRepository.save(a);
		}

		public List<Library> fetchAuthor() {
			List<Library> aList=libraryRepository.findAll();
			return aList;
		}
		
		public List<Library> getByName(String name)
		{
			return libraryRepository.getByBook_name(name);
		}
		public List<Library> getByAuthor(String name)
		{
			return libraryRepository.getByAuthor(name);
		}
		
		@Transactional
		public int deleteByBook_name(String name)
		{
			return libraryRepository.deleteByBook_name(name);
		}
		@Transactional
		public int updateByGenere(String genere,String bookname)
		{
			return libraryRepository.updateByGenere(genere,bookname);
		}

}
