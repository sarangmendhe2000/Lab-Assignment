package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.beans.Project;

public interface EmployeeDao {



	boolean save(Employee emp);

	List<Employee> showEmp();

	boolean modifyById(int id, double sal, String name);


	 Employee findById(int id);

	boolean addProjectToEmp(Project p, Employee e);

	List<Employee> sortEmpBySal();

}
