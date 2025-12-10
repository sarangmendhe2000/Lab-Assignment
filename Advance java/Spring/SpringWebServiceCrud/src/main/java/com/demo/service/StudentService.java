package com.demo.service;

import java.util.List;

import com.demo.beans.Student;
import com.demo.dto.Studentdto;

public interface StudentService {

	List<Studentdto> findAllStudent();

	Studentdto getById(int sid);

	boolean addStudent(Studentdto s);

	boolean updateStudent(Studentdto s);

	boolean deletestudent(int sid);

}
