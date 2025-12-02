package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;
import com.demo.service.ProjectService;
import com.demo.service.ProjectServiceImpl;

public class TestCrudOp {

	public static void main(String[] args) {
		
    EmployeeService eservice= new EmployeeServiceImpl();
    ProjectService pservice=new ProjectServiceImpl();
    int choice=0;
    Scanner sc=new Scanner(System.in);
    
    do {
    	System.out.println("1. Add New Employee");
    	System.out.println("2. Delete Employee");
    	System.out.println("3. Show all Employee");
    	System.out.println("4. Add Project");
    	System.out.println("5.Update Employee salary");
    	System.out.println("Enter 6 for Exit");
    	System.out.println("Enter choice");
    	choice=sc.nextInt();
    
   
		switch(choice) {
		
		case 1->{
			 boolean status=eservice.AddEmployee();
			 if(status) {
				 System.out.println("Employee Added Succsessfully..!");
			 }
			 else {
				 System.out.println("Error: Not Added");
			 }
		}
		
		case 3 ->{
			List<Employee> elist = eservice.showAllEmp();
			elist.stream().forEach(System.out::println);
		}
		
		case 4 ->{
			 boolean status=pservice.addProject();
			 if(status) {
				 System.out.println("Project Added Succsessfully..!");
			 }
			 else {
				 System.out.println("Error: Not Added");
			 }
		}
		
	  	
		}
    }
    while(choice!=6);
	}

}
