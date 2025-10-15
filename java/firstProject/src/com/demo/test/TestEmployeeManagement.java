package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;
public class TestEmployeeManagement {

	public static void main(String[] args) {
	Scanner sc=new  Scanner(System.in);
	
	EmployeeService eservice=new EmployeeServiceImpl();
	
	int choice;
	do {
	System.out.println("1.Add New Employee ");
	System.out.println("2. Display All Employee");
	System.out.println("3. Search by Id");
	System.out.println("4.Search by Name");
	System.out.println("5. Update Salary");
	System.out.println("6.Delete by Id");
	System.out.println("7.Delete by Salary");
	System.out.println("8.Search by Salary");
	System.out.println("9.Sort by salary");
	System.out.println("10.Exit");
	
	System.out.println("Enter choice");
	choice=sc.nextInt();
	
	
	switch(choice) {
	case 1:
		boolean st=eservice.addEmployee();
		if(st) {
		System.out.println("Added Successfully!");
		}else
		{
			System.out.println("Error: not added");
		}
		break;
	case 2:
		List <Employee>result=eservice.displayAll();
		result.forEach(System.out::println);
		break;
	case 3:
		System.out.println("Enter Id for search:");
		int id=sc.nextInt();
		Employee emp=eservice.searchById(id);
		if(emp!=null) {
			System.out.println(emp);
			
		}
		else {
			System.out.println("Not found");
		}
		break;
	case 4:
		System.out.println("Enter Name for Search:");
	    String nm=sc.next();
	    List <Employee>lst=eservice.findByName(nm);
	    if(lst!=null) {
	    lst.forEach(System.out::println);
	    }
	    else {
	    	System.out.println("Name Not Found!");
	    }
		break;
	case 7:
		 System.out.println("Enter Id for Delete");
		 int id2=sc.nextInt();
		 boolean status=eservice.deleteById(id2);
		 if(status) {
			 System.out.println("Deleted Successfully");
		 }else
		 {
			 System.out.println("Error: Plz Try Again..!");
		 }
		break;
	case 10:
		System.out.println("thank you for visiting...");
		break;
		default:
			System.out.println("Wrong choice..");
	}
	}while(choice!=10);
	}
}
