package com.demo.dao;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public interface CourseDao {

	boolean addCourse(String cname , int capacity);

	Map<String, Integer> display();

	int searchByCourseName(String cname);

	boolean newCapacity(String course , int newCapacity);

	Set<String> findByCapacity(int capacity);

	boolean changeByName(String oname, String nname);

	Map<String, Integer> orderByKeys();

	Set<Entry<String, Integer>> sortingByValue();

	boolean removeByCourseName(String courseName);

	boolean removeByCapacity(int cap);
}
