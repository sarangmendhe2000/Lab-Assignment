package com.demo.service;

import java.util.Map;
import java.util.Set;

public interface CourseService {

	boolean addNewCourse();

	Map<String, Integer> displayAll();

	int searchByName(String cname);

	boolean modifyCapacity(String course , int newCapacity);

	Set<String> searchByCapacity(int capacity);

	boolean modifyByName(String oname, String nname);

}
