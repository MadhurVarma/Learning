package com.SpringBoot.JDBC.Dao;

import java.util.List;

import com.SpringBoot.JDBC.Model.Course;

public interface CourseDao {
	
	public void add(Course course);
	public void addBatch(List<Course> coursebatch);
	public List<Course> selectall();
	public Course selectone(int courseId);
//	public void updatecourse(int courseId);
//	public void deletecourse(int courseId);

}
