package com.demo.test;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.demo.service.CourseService;
import com.demo.service.CourseServiceImpl;

public class TestCourseManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		
		CourseService eservice = new CourseServiceImpl();
		
		int choice;
		
		do{
				
			System.out.println("1. Add New Course");
			System.out.println("2. Display All Courses");
			System.out.println("3. Find by Course Name");
			System.out.println("4. Modify Course Capacity");
			System.out.println("5. Find by Course Capacity");
			System.out.println("6. Modify Course Name");
			System.out.println("7. Display in Sorted Order by Keys");
			System.out.println("8. Display in Sorted Order by Values");
			System.out.println("9. Delete by Course Name");
			System.out.println("10.Delete by Course Capacity");
			System.out.println("11. Exit");
			
			
			
			System.out.println("Enter Choice - ");
			choice = sc.nextInt();
			
			
			switch(choice)
			{
				
			case 1 ->{
				
				boolean status = eservice.addNewCourse();
				
				if(status)
				{
					System.out.println("Course Added Successfully ! ");
				}
				else
				{
					System.out.println("Duplicate Course Name ");
				}
			}
			
			case 2 ->{
				
				Map<String,Integer> cmap = eservice.displayAll();
				Set<String> s = cmap.keySet();
				s.forEach(e->System.out.println(e+"------->"+cmap.get(e)));
			}
			
			case 3->{
				
				System.out.println("Enter Course Name - ");
				String cname = sc.next();
				int capacity = eservice.searchByName(cname);
				
				if(capacity != -1)
				{
					System.out.println("Course - "+ cname+"   Capacity = "+ capacity);
				}
				else
				{
					System.out.println("Course Not Found");
				}
			}
			
			case 4 ->{
				
				System.out.println("Enter Course Name -");
				String course = sc.next();
				
				System.out.println("Enter New Capacity - ");
				int newCapacity = sc.nextInt();
				
				boolean status = eservice.modifyCapacity(course , newCapacity);
				
				if(status)
				{
					System.out.println("Modification Done ! ");
				}
				else
				{
					System.out.println("Course Not Found");
				}
			}
			
			case 5 ->{
				
				System.out.println("Enter capacity to Search Course Name");
				int capacity = sc.nextInt();
				
				Set<String> sname = eservice.searchByCapacity(capacity);
				
				if(sname != null)
				{
					sname.forEach(System.out::println);
				}
				else
				{
					System.out.println("Capacity not Found ");
				}
			}
				
			case 6 ->{
				
				System.out.println("Enter old Name");
				String oname=sc.next();
				System.out.println("Enter New Name");
				String nname=sc.next();
			boolean status=eservice.modifyByName(oname, nname);
			if(status) {
				System.out.println("Modify Done");
			}
			else 
			{
				System.out.println("Not found");
			}
			
				
			}	
			
			
			case 7 ->{
				
				Map<String , Integer> cmap = eservice.sortByKeys();
				 
				
				Set<String> keys = cmap.keySet();
				
				keys.forEach(e->System.out.println(e + "------ , " + cmap.get(e)));
			
			}
			
			case 8 ->{
				
				
				Set<Map.Entry<String , Integer>> sset = eservice.sortByValue();
				sset.forEach(e -> System.out.println(e.getKey() + "------"+ e.getValue()));
			}
			
			
			case 9 ->{
				
				System.out.println("Enter Course Name to delete");
				String courseName = sc.next();
				
				boolean status = eservice.deleteByCourseName(courseName);
				
				if(status)
				{
					System.out.println("Deleted Successfully ! ");
				}
				else
				{
					System.out.println("Course Not Found ");
				}
			}
			
			case 10 -> {
				
				System.out.println("Enter Capacity to delete that Course");
				int cap = sc.nextInt();
				
				boolean status = eservice.deleteByCapacity(cap);
				
				if(status)
				{
					System.out.println("Deleted Successfully ! ");
				}
				else
				{
					System.out.println("Capacity not Found ");
				}
				
				
			}
			
			
			case 11 ->{
				
				System.out.println("Thank you for visiting! We hope you enjoy using this application. ");
				break; 
			}
			
			
			
			}
			
			
			
			
		}while(choice != 11);
		

	}

}
