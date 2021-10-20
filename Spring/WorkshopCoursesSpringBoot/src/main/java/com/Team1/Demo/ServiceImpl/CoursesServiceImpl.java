package com.Team1.Demo.ServiceImpl;
import java.security.Timestamp;

import org.springframework.stereotype.Component;

import com.Team1.Demo.Model.Course;
import com.Team1.Demo.Service.CoursesServices;


@Component
public class CoursesServiceImpl implements CoursesServices {
	
	@Override
	public Course addCourse(Course course){
			
	return course;
	
	}
	@Override	
	public String deleteCourse(int courseid){
		
		return "Deleted id" + courseid;
		
	}
	
		@Override

	public Course updateCourse(int courseid, Course updcourse) {

		if(courseid==1) {

			updcourse.setCoursename("Python");	

		} else {

			updcourse.setCoursename("Data Science");

		}

		return updcourse;

	}


		

}




	
	

