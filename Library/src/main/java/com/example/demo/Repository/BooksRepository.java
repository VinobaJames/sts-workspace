package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Book;

public interface BooksRepository extends JpaRepository <Book,Long> {

}
