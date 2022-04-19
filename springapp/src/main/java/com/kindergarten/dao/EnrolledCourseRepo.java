package com.kindergarten.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kindergarten.model.EnrolledCourse;

public interface EnrolledCourseRepo extends JpaRepository<EnrolledCourse, Integer> {
	
	EnrolledCourse findByEnrolledCourseId(int enrolledCourseId);
	
	List<EnrolledCourse> findByCourseCourseId(int courseId);
	
}
