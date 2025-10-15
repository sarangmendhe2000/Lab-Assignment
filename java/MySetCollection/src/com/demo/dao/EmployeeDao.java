package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	Set<Employee> findAll();

	Employee findById(int id);

	Set<Employee> findByName(String name);

	Set<Employee> findBySalary(double sal);

	boolean updateBySalary(int uid, double sall);

	boolean deleteId(int del_id);

	boolean deleteBySal(double del_sal);

	Set<Employee> sortByID();

	List<Employee> sortbyName();

	List<Employee> sortbysal();
	
	

}
