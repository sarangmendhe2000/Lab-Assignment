package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.Student;
import com.demo.dao.StudentDao;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDao sdao;

	@Override
	public Student validateUser(String uname, String pass) {
		
		return sdao.checkUser(uname,pass);
	}
  
}
