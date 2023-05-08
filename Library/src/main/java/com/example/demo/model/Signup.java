package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
   @Table(name="signuptable")
public class Signup {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private int id;
    public Signup(int id, String firstname, String lastname, String email, String password, String confirmpass, int age,
			String gender, int mobileno) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.confirmpass = confirmpass;
		this.age = age;
		this.gender = gender;
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "Signup [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", password=" + password + ", confirmpass=" + confirmpass + ", age=" + age + ", gender=" + gender
				+ ", mobileno=" + mobileno + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	public String getConfirmpass() {
		return confirmpass;
	}
	public void setConfirmpass(String confirmpass) {
		this.confirmpass = confirmpass;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String confirmpass;
    private int age;
    private String gender;
    private int mobileno;
    
    Signup(){}
    
}