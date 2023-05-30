package com.mysite.Petopia.UserMypage.Review;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.mysite.Petopia.MapReview.MapReviewDTO;

public interface ReviewService {
	
	List<MapReviewDTO> findByWriter(String writer);
	
	void deleteById(List<Long> id);
}
