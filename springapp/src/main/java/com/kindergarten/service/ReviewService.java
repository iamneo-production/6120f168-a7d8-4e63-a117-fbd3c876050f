package com.kindergarten.service;

import java.util.List;

import com.kindergarten.model.Review;

public interface ReviewService {

	Review addReview(Review review);

	Review viewReview(int enrolledCourseId);

	Review editReview(int reviewId, Review review);

	Boolean checkReview(int enrolledCourseId);

}
