package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.demo.beans.Project;
import com.demo.dao.ProjectDao;
import com.demo.dao.ProjectDaoImpl;

public class ProjectServiceImpl implements ProjectService {
    private ProjectDao pdao;
    
    
	public ProjectServiceImpl() {
		pdao=new ProjectDaoImpl();
	}


	@Override
	public boolean addProject() {
		 Scanner sc= new Scanner (System.in);
		 System.out.println("Enter Project id");
		 int id=sc.nextInt();
		 System.out.println("Enter Project Name");
		 String name= sc.next();
		 System.out.println("Enter Start date in format dd/MM/yyyy ");
		 String date=sc.next();
		 LocalDate ldt=LocalDate.parse(date,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		 
		 Project proj=new Project(id,name,ldt);
		 return pdao.save(proj);
	}

}
