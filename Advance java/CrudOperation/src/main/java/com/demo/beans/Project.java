	package com.demo.beans;
	
	import java.time.LocalDate;
	import java.util.Set;
	
	import javax.persistence.CascadeType;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.ManyToMany;
	import javax.persistence.Table;
	@Entity
	@Table(name="Project123")
	public class Project {
		@Id
	   private int pid;  
	   private String pname;
	   private LocalDate date;
	   
	   
	   @ManyToMany(mappedBy="pset" , cascade = CascadeType.ALL)
	   Set<Employee> eset;
	   
	   
	public Project() {
		super();
	}
	
	
	public Project(int pid, String pname, LocalDate date) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.date = date;
	}
	
	
	public Set<Employee> getEset() {
		return eset;
	}
	
	
	public void setEset(Set<Employee> eset) {
		this.eset = eset;
	}
	
	
	public Project(int pid, String pname, LocalDate date, Set<Employee> eset) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.date = date;
		this.eset = eset;
	}
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", date=" + date + "]";
	}
	   
}
