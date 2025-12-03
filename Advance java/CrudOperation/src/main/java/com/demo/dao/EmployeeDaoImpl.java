package com.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.beans.Employee;
import com.demo.beans.Project;

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
	@Override
	public boolean modifyById(int id, double sal, String name) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		boolean flag=false;
		Employee e=session.get(Employee.class,id);
		if(e!=null) {
			e.setEname(name);
			e.setSal(sal);
			session.merge(e);
			flag=true;
		}
		tr.commit();
		session.close();
		return flag;
	}
	
	
	@Override
	public Employee findById(int id) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Employee e=session.get(Employee.class,id);
		tr.commit();
		session.close();
		
		
		return e;
	}
	@Override
	public boolean addProjectToEmp(Project p, Employee e) {
	
		
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		e.getPset().add(p);
		p.getEset().add(e);
		session.update(e);
		tr.commit();
		session.close();
		
		
		return true;
	}
	@Override
	public List<Employee> sortEmpBySal() {
		
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		List<Employee> elist = session.createQuery("from Employee e order by e.sal desc", Employee.class).list();
		
		tr.commit();
		session.close();
		
		return elist;
	}
    
	
	

}
