package com.demo.beans;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="Emp123")
public class Employee {
	@Id
 private int eid;
 private String ename;
 private double sal;
 private LocalDate Hiredate;
 
 
 @ManyToMany(fetch = FetchType.EAGER)
 Set<Project>pset;
 
 
 
public Employee() {
	super();
}
public Employee(int eid, String ename, double sal, LocalDate hiredate) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.sal = sal;
	Hiredate = hiredate;
}

public Employee(int eid, String ename, double sal, LocalDate hiredate, Set<Project> pset) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.sal = sal;
	Hiredate = hiredate;
	this.pset = pset;
}

public Set<Project> getPset() {
	return pset;
}
public void setPset(Set<Project> pset) {
	this.pset = pset;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
public LocalDate getHiredate() {
	return Hiredate;
}
public void setHiredate(LocalDate hiredate) {
	Hiredate = hiredate;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + ", Hiredate=" + Hiredate + " , pset=" + pset + " ]";
}
 
}
