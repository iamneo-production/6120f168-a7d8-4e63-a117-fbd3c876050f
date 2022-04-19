package com.kindergarten.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindergarten.dao.EnrolledCourseRepo;
import com.kindergarten.model.EnrolledCourse;

@Service
public class EnrolledCourseServiceImpl implements EnrolledCourseService {
	@Autowired
	EnrolledCourseRepo enrolledCourseRepo;

	@Override
	public EnrolledCourse addAdmission(EnrolledCourse enrolledCourse) {
		return enrolledCourseRepo.save(enrolledCourse);
	}

	@Override
	public EnrolledCourse viewAdmission(int id) {
		return enrolledCourseRepo.findByEnrolledCourseId(id);
	}

	@Override
	public String deleteAdmission(int id) {
		enrolledCourseRepo.deleteById(id);
		return "Deleted id " + id;
	}
}
