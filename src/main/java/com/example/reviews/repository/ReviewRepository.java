package com.example.reviews.repository;

import com.example.reviews.exceptions.ReviewsBadRequestException;
import com.example.reviews.exceptions.ReviewsResourceNotFoundException;
import com.example.reviews.model.Review;

import java.util.List;

public interface ReviewRepository {
    List<Review> findAll(Integer userId, Integer courseId) throws ReviewsResourceNotFoundException;

    Review findById(Integer userId, Integer courseId, Integer reviewId) throws ReviewsResourceNotFoundException;


    Integer create(Integer userId, Integer courseId, String description) throws ReviewsBadRequestException;

    void update(Integer userId, Integer reviewId, Integer courseId, Review review) throws ReviewsBadRequestException;

    void removeById(Integer userId, Integer reviewId, Integer courseId) throws ReviewsResourceNotFoundException;
}
