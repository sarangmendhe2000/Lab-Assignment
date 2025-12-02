package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {



	boolean save(Employee emp);

	List<Employee> showEmp();

}
