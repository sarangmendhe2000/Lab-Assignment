package com.demo.beans;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="course1")
public class Course {
	
	@Id
	
	private int cid;
	private String cname;
	private String cfaculty;
	private int duration;
	
	@OneToMany(mappedBy="cor")
	Set<Student> std;
	
	
	public Course() {
		super();
	}
	public Course(int cid, String cname, String cfaculty, int duration) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cfaculty = cfaculty;
		this.duration = duration;
	}
	
	public Course(int cid, String cname, String cfaculty, int duration, Set<Student> std) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cfaculty = cfaculty;
		this.duration = duration;
		this.std = std;
	}

	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCfaculty() {
		return cfaculty;
	}
	public void setCfaculty(String cfaculty) {
		this.cfaculty = cfaculty;
	}
	public int getDuration() {
		return duration;
	}

	public Set<Student> getStd() {
		return std;
	}
	public void setStd(Set<Student> std) {
		this.std = std;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", cfaculty=" + cfaculty + ", duration=" + duration + "]";
	}
	
	
	
}
