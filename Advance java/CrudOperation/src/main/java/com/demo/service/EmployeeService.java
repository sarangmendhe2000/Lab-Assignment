package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean AddEmployee();

	List<Employee> showAllEmp();

	boolean deleteById(int id);

	boolean updateById(int id, double sal, String name);

	boolean assignProject(int eid, int pid);

	List<Employee> sortBySal();

}
