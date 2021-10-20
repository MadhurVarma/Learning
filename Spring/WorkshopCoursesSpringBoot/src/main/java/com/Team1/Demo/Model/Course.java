package com.Team1.Demo.Model;


import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Course {
	
private int courseid;
private String coursename;
private String coursedesc;
private String skillreqd;
private String createdon;
private Timestamp lastupdatedon;

	
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

//public void setCreatedon(Timestamp createdon){
	public void setCreatedon(String createdon){
	
	this.createdon=createdon;		
	
}

//public Timestamp getCreatedon(){
public String getCreatedon(){
	return createdon;
}

public void setLastUpdatedon(){
//	public void setLastUpdatedon(String lastupdatedon){

	this.lastupdatedon=Timestamp.valueOf(LocalDateTime.now());	
	
}

public Timestamp getLastUpdatedon(){
//	public String getLastUpdatedon(){
	
	return lastupdatedon;
}
	

}







	
	
	

