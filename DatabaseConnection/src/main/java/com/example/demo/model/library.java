package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class library {
	@Id
	
	private int lsno;
	private int lbookno;
	private String lname;
	private String lgenre;
	private String lauthor;
	private String llanguage;
	private String lpublisher;
	private int lprice;
	public int getLsno() {
		return lsno;
	}
	public void setLsno(int lsno) {
		this.lsno = lsno;
	}
	public int getLbookno() {
		return lbookno;
	}
	public void setLbookno(int lbookno) {
		this.lbookno = lbookno;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLgenre() {
		return lgenre;
	}
	public void setLgenre(String lgenre) {
		this.lgenre = lgenre;
	}
	public String getLauthor() {
		return lauthor;
	}
	public void setLauthor(String lauthor) {
		this.lauthor = lauthor;
	}
	public String getLlanguage() {
		return llanguage;
	}
	public void setLlanguage(String llanguage) {
		this.llanguage = llanguage;
	}
	public String getLpublisher() {
		return lpublisher;
	}
	public void setLpublisher(String lpublisher) {
		this.lpublisher = lpublisher;
	}
	public int getLprice() {
		return lprice;
	}
	public void setLprice(int lprice) {
		this.lprice = lprice;
	}
	
	

}
