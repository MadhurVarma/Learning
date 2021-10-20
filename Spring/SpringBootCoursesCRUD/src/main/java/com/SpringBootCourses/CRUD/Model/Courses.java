package com.SpringBootCourses.CRUD.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Courses")
public class Courses {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseid;
	
	@Column(name="course_name")
	private String coursename;
	
	@Column(name="course_desc")
	private String coursedesc;
	
	@Column(name="skill_reqd")
	private String skillreqd;
	
	
	public Courses(){
		
		super();
	}
	
	public Courses(	String coursename,String coursedesc,String skillreqd)
	{
	
		super();
		this.coursename=coursename;
		this.coursedesc=coursedesc;
		this.skillreqd=skillreqd;
	}
	
	
	public void setCourseid(int courseid){
		
		this.courseid=courseid;		
		
	}
	
	public int getCourseid(){
		
		return courseid;
	}
	
	public void setCoursename(String coursename){
		
		this.coursename=coursename;		
		
	}
	
	public String getCoursename(){
		
		return coursename;
	}
	
	public void setCoursedesc(String coursedesc){
		
		this.coursedesc=coursedesc;		
		
	}
	
	public String getCoursedesc(){
		
		return coursedesc;
	}
	
    public void setSkillreqd(String skillreqd){
		
		this.skillreqd=skillreqd;		
		
	}
	
	public String getSkillreqd(){
		
		return skillreqd;
	}

	 
	
	
}
