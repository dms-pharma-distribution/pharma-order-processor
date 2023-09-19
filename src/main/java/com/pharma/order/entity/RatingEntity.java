package com.pharma.order.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rating", schema = "oms_schema")
public class RatingEntity {
	@Id
	@Column(name = "rating_id")
	private Long ratingId;

	@Column(name = "rating")
	private Double rating;

	@Column(name = "feed_back")
	private String feedback;

	@Column(name = "order_guid")
	private UUID orderGuid;

	public RatingEntity() {
		super();
	}

	public RatingEntity(Long ratingId, Double rating, String feedback, UUID orderGuid) {
		super();
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
