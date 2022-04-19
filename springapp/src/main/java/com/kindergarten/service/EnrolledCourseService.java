package com.kindergarten.service;

import java.util.List;

import com.kindergarten.model.EnrolledCourse;

public interface EnrolledCourseService {

	EnrolledCourse addAdmission(EnrolledCourse student);

	EnrolledCourse viewAdmission(int id);

	String deleteAdmission(int id);

}
