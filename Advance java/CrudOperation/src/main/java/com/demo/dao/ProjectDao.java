package com.demo.dao;

import java.util.Set;

import com.demo.beans.Project;

public interface ProjectDao {

	boolean save(Project proj);

	Set<Project> findById(String[] parr);

	boolean removeById(int id);
   Project findById(int id);
}
