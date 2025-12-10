package com.demo.beans;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {

	private int sid;
	private String sname;
	private String address;
	private String email;
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private LocalDate dob;

	public Student() {
		super();
	}

	public Student(int sid, String sname, String address, String email, LocalDate dob) {
		super();
		this.sid = sid;
		this.sname = sname;
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

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
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
		return "Student [sid=" + sid + ", sname=" + sname + ", address=" + address + ", email=" + email + ", dob=" + dob
				+ "]";
	}

}
