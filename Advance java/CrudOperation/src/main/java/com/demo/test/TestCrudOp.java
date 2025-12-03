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
    	System.out.println("6. Add Employee in Existing project");
    	System.out.println("7. Display Employee in Sorted Order By salary");
    	System.out.println("Enter 8 for Exit");
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
		
		case 2 ->{
			System.out.println("Enter Employee Id For Deletion -");
			int id = sc.nextInt();
			
			boolean status = eservice.deleteById(id);
			if(status)
			{
				System.out.println("Deleted Successfully ! ");
			}
			else
			{
				System.out.println("Error : Please Try Again");
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
		case 5->{
			System.out.println("Enter Employee Id For Update");
			int id=sc.nextInt();
			System.out.println("Enter New salary");
			double sal=sc.nextDouble();
			System.out.println("Enter new Name");
			String name=sc.next();
			boolean status=eservice.updateById(id,sal,name);
			if(status) {
				System.out.println("Updated Succsessfully..!");
			}
			else {
				System.out.println("Error: not updated");
			}
		}
		case 6->{
			
			System.out.println("Enter Employee id");
			int eid = sc.nextInt();
			System.out.println("Enter Project Id ");
			int pid = sc.nextInt();
			
			boolean status = eservice.assignProject(eid , pid);
			if(status)
			{
				System.out.println("Project Assign Successfully ! ");
			}
			else
			{
				System.out.println("Error:  Something went Wrong ");
			}
		}	
		case 7 ->{
			
			List<Employee> elist = eservice.sortBySal();
			elist.stream().forEach(System.out::println);
			
		}
		}
    }
    while(choice!=8);
	}

}
