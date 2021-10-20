package com.SpringBootCourses.CRUD.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBootCourses.CRUD.Model.Courses;

@Repository
public interface CoursesRepository extends JpaRepository<Courses,Integer> {

}
