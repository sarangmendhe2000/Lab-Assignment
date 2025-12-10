package com.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Student;
import com.demo.dao.StudentDao;
import com.demo.dto.Studentdto;
import com.demo.mapper.StudentDtoMapper;


@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao sdao;

	@Override
	public List<Studentdto> findAllStudent() {
		 List<Student> list =  sdao.findAllStudent();
		 List<Studentdto> slist = list.stream().map(stud-> StudentDtoMapper.mapToStudentDto(stud)).collect(Collectors.toList());
		 return slist;
	}

	@Override
	public Studentdto getById(int sid) {
		
		Student s= sdao.findById(sid);
		Studentdto s1= StudentDtoMapper.mapToStudentDto(s);
		return s1;
		
	}

	@Override
	public boolean addStudent(Studentdto s) {
		Student s1=StudentDtoMapper.mapToStudent(s);
		
		return sdao.insertStudent(s1);
	}

	@Override
	public boolean updateStudent(Studentdto s) {
		System.out.println("In service s"+s);
		Student s1=StudentDtoMapper.mapToStudent(s);
		
		System.out.println("In service s1 "+s1);
		return sdao.update(s1);
	}

	@Override
	public boolean deletestudent(int sid) {
		
		return sdao.deleteStudent(sid);
	}
	
	
}