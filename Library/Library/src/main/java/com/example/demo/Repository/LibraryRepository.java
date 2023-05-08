package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Library;

public interface LibraryRepository  extends JpaRepository<Library, Long> {

}
