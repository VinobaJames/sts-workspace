package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Library;


@Repository
public interface LibraryRepository  extends JpaRepository<Library,Integer> {
	List<Library> findByid(int id);
	
	//DDL
	//positional
	@Query("select s from Library s where s.book_name=?1")
	public List<Library> getByBook_name(String name);
	
	//named
	@Query("select s from Library s where s.author=:author")
	public List<Library> getByAuthor(String author);

	
	//DML
	@Modifying
	@Query("delete  from Library s where s.book_name=?1")
	public int deleteByBook_name(String name);
	
	@Modifying
	@Query("update Library s set s.genere=?1 where s.book_name=?2")
	public int updateByGenere(String genere,String bookname);
}
