package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="onlinelibrary")
public class Library {
	
	@Id
	private int id;
	private String book_name;
	private String author;
	private String genere;
	private int year_of_publish;
	
	public Library()
	{
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public int getYear_of_publish() {
		return year_of_publish;
	}
	public void setYear_of_publish(int year_of_publish) {
		this.year_of_publish = year_of_publish;
	}
	public Library(int id, String book_name, String author, String genere, int year_of_publish) {
		super();
		this.id = id;
		this.book_name = book_name;
		this.author = author;
		this.genere = genere;
		this.year_of_publish = year_of_publish;
	}
	@Override
	public String toString() {
		return "Library [id=" + id + ", book_name=" + book_name + ", author=" + author + ", genere=" + genere
				+ ", year_of_publish=" + year_of_publish + "]";
	}
	
	

}
