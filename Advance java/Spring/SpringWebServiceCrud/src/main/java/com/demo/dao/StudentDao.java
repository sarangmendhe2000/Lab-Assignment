package com.demo.dao;

import java.util.List;

import com.demo.beans.Student;
import com.demo.dto.Studentdto;

public interface StudentDao {

	List<Student> findAllStudent();

	Student findById(int sid);

	boolean insertStudent(Student s1);

	boolean update(Student s1);

	boolean deleteStudent(int sid);

}
