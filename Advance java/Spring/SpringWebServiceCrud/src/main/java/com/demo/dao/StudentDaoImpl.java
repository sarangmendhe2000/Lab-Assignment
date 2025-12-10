package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	JdbcTemplate jdbctemplate;

	@Override
	public List<Student> findAllStudent() {
		List<Student> slist = jdbctemplate.query("Select * from student3 ",

				(rs, n) -> {

					Student s = new Student();
					s.setSid(rs.getInt(1));
					s.setSname(rs.getString(2));
					s.setAddress(rs.getString(3));
					s.setEmail(rs.getString(4));

					if (s.getDob() == null) {
						s.setDob(null);
					} else {
						s.setDob(rs.getDate(5).toLocalDate());
					}
					return s;
				}

		);
		return slist;
	}

	@Override
	public Student findById(int sid) {
		try {
			@SuppressWarnings("deprecation")
			Student s = jdbctemplate.queryForObject("select * from student3 where sid=? ", new Object[] { sid },
					BeanPropertyRowMapper.newInstance(Student.class));

			return s;

		} catch (EmptyResultDataAccessException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public boolean insertStudent(Student s1) {
		int n = jdbctemplate.update("insert into student3 values(?,?,?,?,?)",
				new Object[] { s1.getSid(), s1.getSname(), s1.getAddress(), s1.getEmail(), s1.getDob() });
		return n > 0;
	}

	@Override
	public boolean update(Student s1) {
		System.out.println(s1);
		int n = jdbctemplate.update("update student3 set name=? , address=?, email=? ,dob=? where sid=?",
				new Object[] { s1.getSname(), s1.getAddress(), s1.getEmail(), s1.getDob(), s1.getSid() });
		System.out.println(n);
		return n > 0;
	}

	@Override
	public boolean deleteStudent(int sid) {
		int n = jdbctemplate.update("delete from student3 where sid=?", new Object[] { sid });

		return n > 0;
	}

}
