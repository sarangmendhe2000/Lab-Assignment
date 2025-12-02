package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.beans.Project;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.dao.ProjectDao;
import com.demo.dao.ProjectDaoImpl;


public class EmployeeServiceImpl implements EmployeeService {
  private EmployeeDao edao;
  private ProjectDao pdao;
  
	public EmployeeServiceImpl() {

	edao = new EmployeeDaoImpl();
	pdao = new ProjectDaoImpl();
}

	@Override
	public boolean AddEmployee() {
      Scanner sc=new Scanner(System.in);
      System.out.println("Emter Id");
      int id=sc.nextInt();
    		  
      System.out.println("Enter Employee Name");
      String name=sc.next();
      
      System.out.println("Enter Salary");
      double sal=sc.nextDouble();
      
      System.out.println("Enter Hiredate in DD/MM/YYYY");
      String date=sc.next();
     LocalDate ldt=LocalDate.parse(date,DateTimeFormatter.ofPattern("dd/MM/yyyy")) ;
     
     System.out.println("Enter project Id :- ");
     String pid = sc.next();
     String [] parr = pid.split(",");
     Set<Project>pset = pdao.findById(parr);
     
     
     
      Employee emp=new Employee(id, name,sal,ldt,pset);  
      return edao.save(emp);
      
	}

	@Override
	public List<Employee> showAllEmp() {
		
		return edao.showEmp();
	}
	

}
