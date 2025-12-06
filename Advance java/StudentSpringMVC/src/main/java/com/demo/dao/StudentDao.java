package com.demo.dao;

import com.demo.bean.Student;

public interface StudentDao {

	Student checkUser(String uname, String pass);

}
