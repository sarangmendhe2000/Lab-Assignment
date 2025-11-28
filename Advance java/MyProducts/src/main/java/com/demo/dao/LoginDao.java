package com.demo.dao;

import com.demo.beans.User;

public interface LoginDao {

	User checkUser(String userName, String password);

	boolean changePassword(String name,String em, String password);

	boolean addNewUser(User myUser);

}
