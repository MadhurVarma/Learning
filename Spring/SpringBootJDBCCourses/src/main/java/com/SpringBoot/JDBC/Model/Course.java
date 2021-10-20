package com.SpringBoot.JDBC.Model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Course {
	
	private int courseId;
	private String courseName;
	private String courseDesc;
	private String skillReqd;
	private Timestamp createdOn;
	private Timestamp lastUpdatedOn;
	
	public void setCourseId(int courseid)
	{
		this.courseId=courseid;
	}
	
	public int getCourseId()
	{
		return courseId;
	}
	
	
	public void setCourseName(String coursename)
	{
		this.courseName=coursename;
	}
	
	public String getCourseName()
	{
		return courseName;
	}
	
	public void setCourseDesc(String coursedesc)
	
	{
		
		this.courseDesc=coursedesc;
	}
	
	public String getCourseDesc()
	
	{
		return courseDesc;
	}
	
	public void setSkillReqd(String skillreqd)
	{
		this.skillReqd=skillreqd;
	}
	
	
	public String getSkillReqd()
	{
		return skillReqd;
	}
	
	public void setCreatedOn(Timestamp createdon)
	{
		//LocalDateTime crtdon=LocalDateTime.now();
	//	this.createdOn=Timestamp.valueOf(crtdon);
		this.createdOn=createdon;
	}
	
	public Timestamp getCreatedOn()
	{
		return createdOn;
	}
	
	public void setLastUpdatedOn(Timestamp lastupdatedon){
		//LocalDateTime lastupdon=LocalDateTime.now();
		//this.lastUpdatedOn=Timestamp.valueOf(lastupdon);
		this.lastUpdatedOn=lastupdatedon;
				
	}
	
	public Timestamp getLastUpdatedOn(){
		
		return lastUpdatedOn;
		
	}
	
	{
		
	}
	}
	