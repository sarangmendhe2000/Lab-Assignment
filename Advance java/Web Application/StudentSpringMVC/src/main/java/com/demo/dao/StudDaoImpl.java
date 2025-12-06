package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.bean.Student;

@Repository
public class StudDaoImpl implements StudDao {
	
	@Autowired
	
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Student> displayAll() {
		
	List<Student> slist =	jdbcTemplate.query("Select * from student3", 
				
				(rs , n) ->{ 
						Student s = new Student();
						
						s.setSid(rs.getInt(1));
						s.setSname(rs.getString(2));
						s.setAddr(rs.getString(3));
						s.setEmail(rs.getString(4));
						if(rs.getDate(5) == null)
						{
							s.setDob(null);
						}
						else {
						s.setDob(rs.getDate(5));
						}
						return s;
				});
		return slist;
	}

}
