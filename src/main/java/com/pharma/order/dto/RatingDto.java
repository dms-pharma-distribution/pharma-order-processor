package com.pharma.order.dto;

import java.util.UUID;

public class RatingDto {
	private Long ratingId;
	private Double rating;
	private String feedback;
	private UUID orderGuid;

	public RatingDto() {
	}

	public RatingDto(Long ratingId, Double rating, String feedback, UUID orderGuid) {
		this.ratingId = ratingId;
		this.rating = rating;
		this.feedback = feedback;
		this.orderGuid = orderGuid;
	}

	public Long getRatingId() {
		return ratingId;
	}

	public void setRatingId(Long ratingId) {
		this.ratingId = ratingId;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public UUID getOrderGuid() {
		return orderGuid;
	}

	public void setOrderGuid(UUID orderGuid) {
		this.orderGuid = orderGuid;
	}

}
