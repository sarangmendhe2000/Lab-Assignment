package com.demo.beans;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="student1")
public class Student {
	
	@Id
	private int sid;
	private String sname;
	private String email;
	
	@ManyToOne(fetch = FetchType.LAZY)
	Course cor;

	public Student() {
		super();
	}

	public Student(int sid, String sname, String email, Course cor) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.cor = cor;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Course getCor() {
		return cor;
	}

	public void setCor(Course cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", email=" + email + ", cor=" + cor + "]";
	}
	
	
	
}
