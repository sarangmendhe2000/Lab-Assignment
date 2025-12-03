package com.demo.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.beans.Employee;
import com.demo.beans.Project;

public class ProjectDaoImpl implements ProjectDao {
   static SessionFactory sf;
   static {
	   
	   sf=HibernateUtil.getMySessionFactory();
   }
   
   
	@Override
	public boolean save(Project proj) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		 session.saveOrUpdate(proj);
		
		tr.commit();
		session.close();

		return true;
	}





	@Override
	public Set<Project> findById(String[] parr) {
		
		Set<Project> pset = new HashSet<>();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		for(String pid : parr)
		{
			Project p = session.get(Project.class, Integer.parseInt(pid));
			pset.add(p);
		}
		
	
		return pset;
	}
	




	@Override
	public boolean removeById(int id) {
		
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Employee e = session.get(Employee.class , id);
		boolean flag = false;
		if(e != null)
		{
			session.delete(e);
			flag = true;
		}
		
		
		tr.commit();
		session.close();
	
		return flag;
	}



	@Override
	public Project findById(int id) {
		Session session =sf.openSession();
		Transaction tr=session.beginTransaction();
	    Project p=session.get(Project.class,id);
	   
		return p;
		
	}}
