package com.demo.service;
import java.util.*;
import java.util.Map.Entry;

import com.demo.dao.CourseDao;
import com.demo.dao.CourseDaoImpl;

public class CourseServiceImpl implements CourseService {
		
	private CourseDao edao;
	
	
	
	
	public CourseServiceImpl() {
		super();
		this.edao = new CourseDaoImpl();
	}




	@Override
	public boolean addNewCourse() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Course Name");
		String cname = sc.nextLine();
		System.out.println("Enter Capacity");
		int capacity = sc.nextInt();
		
		
		return edao.addCourse(cname , capacity);
	}




	@Override
	public Map<String, Integer> displayAll() {
		
		
		return edao.display();
	}




	@Override
	public int searchByName(String cname) {

		return edao.searchByCourseName(cname);
	}




	@Override
	public boolean modifyCapacity(String course , int newCapacity) {
		
		return edao.newCapacity(course , newCapacity);
	}




	@Override
	public Set<String> searchByCapacity(int capacity) {
		
		return edao.findByCapacity(capacity);
	}




	@Override
	public boolean modifyByName(String oname, String nname) {
	
		return edao.changeByName(oname,nname);
	}




	@Override
	public Map<String, Integer> sortByKeys() {
		
		return edao.orderByKeys();
	}




	@Override
	public Set<Entry<String, Integer>> sortByValue() {
		
		return edao.sortingByValue();
		
	}




	@Override
	public boolean deleteByCourseName(String courseName) {
		
		
		return edao.removeByCourseName(courseName);
	}




	@Override
	public boolean deleteByCapacity(int cap) {
	
		return edao.removeByCapacity(cap);
	}






}
