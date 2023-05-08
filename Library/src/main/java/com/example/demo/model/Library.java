package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Library {

	@Id
	@GeneratedValue
	private int id;
	private String book_name;
	private String author;
	private String genere;
	private int year_of_publish;
	private int no_of_volumes;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="author")
	private List<Book> bookinfo;
	Library(){}
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
	public int getNo_of_volumes() {
		return no_of_volumes;
	}
	public void setNo_of_volumes(int no_of_volumes) {
		this.no_of_volumes = no_of_volumes;
	}
	public List<Book> getBookinfo() {
		return bookinfo;
	}
	public void setBookinfo(List<Book> bookinfo) {
		this.bookinfo = bookinfo;
	}
}
