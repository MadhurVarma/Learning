package com.SpringBootCourses.CRUD.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootCourses.CRUD.Model.Courses;
import com.SpringBootCourses.CRUD.Repository.CoursesRepository;

@RestController
@RequestMapping("/Courses")

public class CoursesController {

	@Autowired
	private CoursesRepository coursesRepository;

	// Select Courses

	@GetMapping("/getcourses")
	public List<Courses> selectCourses() {

		return this.coursesRepository.findAll();

	}

	// select Courses by Id
	@GetMapping("/getcourses/{id}")
	public ResponseEntity<Courses> selectCoursebyId(@PathVariable(value = "id") int courseid) {
		Optional<Courses> courses = coursesRepository.findById(courseid);

		if (courses.isPresent())
			return ResponseEntity.ok().body(courses.get());
		else
			return ResponseEntity.ok().body(new Courses());

	}

	// create Courses -save
	@PostMapping("/addcourses")
	public Courses createCourses(@RequestBody Courses courses)

	{
		return this.coursesRepository.save(courses);
	}

	// Update Courses
	@PutMapping("/Updatecourses/{id}")
	public ResponseEntity<Courses> updateCourse(@PathVariable(value = "id") int courseid,
			@RequestBody Courses Updcourse) {

		// Courses courses = coursesRepository.getById(courseid);
		Optional<Courses> courses = coursesRepository.findById(courseid);

		if (courses.isPresent()) {
			Courses c = courses.get();
			c.setCoursename(Updcourse.getCoursename());
			c.setSkillreqd(Updcourse.getSkillreqd());

			return ResponseEntity.ok(this.coursesRepository.save(c));
		} else
			return ResponseEntity.ok().body(new Courses());

	}

	// delete courses
	@DeleteMapping("/Deletecourses/{id}")

	public boolean deleteCourse(@PathVariable(value = "id") int courseid) {
		Optional<Courses> courses = coursesRepository.findById(courseid);
		if (courses.isPresent()) {
			Courses cd = courses.get();
			this.coursesRepository.delete(cd);
			return true;
		} else

			return false;

	}

}