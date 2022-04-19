package com.kindergarten.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kindergarten.model.Academy;
import com.kindergarten.model.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {

	List<Course> findByCourseName(String courseName);
	
	Course findByCourseId(int courseId);
	
	List<Course> findByAcademyAcademyId(int academyId);
	
	List<Course> findByAcademy_AcademyId(int academyId);
	
}
