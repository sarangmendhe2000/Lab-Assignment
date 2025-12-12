package com.demo.MySpringbootRestWebService.Bean;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student3")
public class Student {
	
	@Id
	private int sid;
	private String name;
	private String address;
	private String email;
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private LocalDate dob;
	
	
	public Student() {
		super();
	}


	public Student(int sid, String name, String address, String email, LocalDate dob) {
		super();
		this.sid = sid;
		this.name = name;
		this.address = address;
		this.email = email;
		this.dob = dob;
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", address=" + address + ", email=" + email + ", dob=" + dob
				+ "]";
	}
	
	
	
	
	
}
