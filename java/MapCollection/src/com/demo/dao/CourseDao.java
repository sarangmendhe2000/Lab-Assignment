package com.demo.dao;

import java.util.Map;
import java.util.Set;

public interface CourseDao {

	boolean addCourse(String cname , int capacity);

	Map<String, Integer> display();

	int searchByCourseName(String cname);

	boolean newCapacity(String course , int newCapacity);

	Set<String> findByCapacity(int capacity);

	boolean changeByName(String oname, String nname);

	

}
