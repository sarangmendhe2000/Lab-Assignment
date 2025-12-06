package com.demo.bean;

//import java.time.LocalDate;
import java.util.Date;

public class Student {
    private int sid;
    private String sname;
    private String addr;
    private String email;
    private Date dob;
	public Student() {
		super();
	}
	public Student(int sid, String sname, String addr, String email, Date dob) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.addr = addr;
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", addr=" + addr + ", email=" + email + ", dob=" + dob
				+ "]";
	}
    
}
