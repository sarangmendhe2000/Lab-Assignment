package com.demo.MySpringbootRestWebService.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.MySpringbootRestWebService.Bean.MyUser;

@Repository
public interface LoginDao extends JpaRepository<MyUser, Integer> {

	@Query(value= "select * from registration where uname = :uname" , nativeQuery=true)
	MyUser findByUname(@Param("uname") String uname);
	
	
}
