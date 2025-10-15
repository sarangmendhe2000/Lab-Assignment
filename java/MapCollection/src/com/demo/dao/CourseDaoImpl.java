package com.demo.dao;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CourseDaoImpl implements CourseDao {

	static Map<String,Integer> hm;
	
	static {
		hm = new HashMap<>();
		hm.put("DAC", 120);
		hm.put("DBDA", 240);
		hm.put("DBAI", 120);
	}
	@Override
	public boolean addCourse(String cname , int capacity) {
		
		if(hm.containsKey(cname))
		{
			return false;
		}
		else
		{
			hm.put(cname, capacity);
			return true;
		}
		
	}
	@Override
	public Map<String, Integer> display() {
		
		
		return hm;
	}
	@Override
	public int searchByCourseName(String cname) {
		
		if(hm.containsKey(cname))
		{
			return hm.get(cname);
			
		}
		else
		{
			return -1;
		}
	}
	@Override
	public boolean newCapacity(String course , int newCapacity) {
		
		if(hm.containsKey(course))
				{
//			        return  hm.replace(course, hm.get(course), newCapacity);
					 hm.put(course , newCapacity);
					 return true;
			        
				}
		else
		{
			return false;
		}
	
	}
	@Override
	public Set<String> findByCapacity(int capacity) {
		
		Set<String> cset = new HashSet<>();
		
		Set<String> keys = hm.keySet();
		
		for(String s : keys)
		{
			if(hm.get(s) == capacity)
			{
				cset.add(s);
				
			}
		}
		
		return cset;
	}
	@Override
	public boolean changeByName(String oname, String nname) {
		if(hm.containsKey(oname))
		{
		 int c=hm.get(oname);
		 hm.remove(oname);
		 hm.put(nname, c);
			return true;
		}
			
		return false;
	}
	@Override
	public Map<String, Integer> orderByKeys() {
		
		Map<String , Integer> tmap = new TreeMap<>();
		Set<String> keys = hm.keySet();
		
		for(String s : keys)
		{
			tmap.put(s, hm.get(s));
		}
		
		return tmap;
	}
	@Override
	public Set<Map.Entry<String, Integer>> sortingByValue() {
		
		Set<Map.Entry<String, Integer>> smap = hm.entrySet();
		
		//comparator to sort by values
		
		Comparator<Map.Entry<String , Integer>> c =(o1,o2)->{
			
//			int value =  o1.getValue()-o2.getValue();
			int value = o1.getValue().compareTo(o2.getValue());
			
			if(value != 0)
			{
				return value;
			}
			else
			{
				return o1.getKey().compareTo(o2.getKey());
			}
		};
		
		Set<Map.Entry<String, Integer>> tset = new TreeSet<>(c);
		
		for(Map.Entry<String, Integer> e :smap)
		{
			tset.add(e);
		}
		
		return tset;
	}
	@Override
	public boolean removeByCourseName(String courseName) {
		
		if( hm.containsKey(courseName) )
		{
			hm.remove(courseName);
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	@Override
	public boolean removeByCapacity(int cap) {
		
		Set<String> sset = hm.keySet();
		boolean flag = false;
		
		Iterator<String> it = sset.iterator();
		
		while(it.hasNext())
		{
			String s = it.next();
			if(hm.get(s) == cap)
			{
				it.remove();
				flag= true;
			}
		}
		
		if(flag=true)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
}
