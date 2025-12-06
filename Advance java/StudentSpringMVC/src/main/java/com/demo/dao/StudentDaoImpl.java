package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.bean.Student;

@Repository
public class StudentDaoImpl implements StudentDao{

	@Autowired
	JdbcTemplate jdbcTemplate ;
	
	
	@Override
	public Student checkUser(String uname, String pass) {
		
		try {
		@SuppressWarnings("deprecation")
		Student stud = jdbcTemplate.queryForObject("Select uname , password from Registration where uname=? and password=? ", 
				
				new Object[] {uname , pass} , BeanPropertyRowMapper.newInstance(Student.class)
					
					
				);
		return stud;
		}catch(EmptyResultDataAccessException e)
		{
			System.out.println("Student not Found");
			return null;
		}
	}

}
