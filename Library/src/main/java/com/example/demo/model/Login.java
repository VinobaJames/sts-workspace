package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="signuptable")
public class Login {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	private String email;
	  private String password;
	@Override
	public String toString() {
		return "LoginEntity [id=" + id + ", email=" + email + ", password=" + password + "]";
	}
	public Login() {
		super();
	}
	public Login(int id, String email, String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
