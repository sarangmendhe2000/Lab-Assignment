package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
 static SessionFactory sf;
   static {
	   sf= HibernateUtil.getMySessionFactory();
   }
	@Override
	public boolean save(Employee emp) {
	 
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		 
		session.saveOrUpdate(emp);
		
		tr.commit();
		session.close();
		return true;
	}
	@Override
	public List<Employee> showEmp() {
		
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		
		List<Employee> elist = session.createQuery("from Employee" , Employee.class).list();
		
		tr.commit();
		session.close();
		
		
		return elist;
	}
    
	
	

}
