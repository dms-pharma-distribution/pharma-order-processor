package com.pharma.order.dto;

import java.io.Serializable;

public class OrderQueryDto implements Serializable {

	private static final long serialVersionUID = 2515033700689069526L;

	private OrderDto orderDto;
	private RatingDto ratingDto;
	private OrderHistoryDto orderHistoryDto;

	public OrderQueryDto() {
		super();
	}

	public OrderQueryDto(OrderDto orderDto, RatingDto ratingDto, OrderHistoryDto orderHistoryDto) {
		super();
		this.orderDto = orderDto;
		this.ratingDto = ratingDto;
		this.orderHistoryDto = orderHistoryDto;
	}

	public OrderDto getOrderDto() {
		return orderDto;
	}

	public void setOrderDto(OrderDto orderDto) {
		this.orderDto = orderDto;
	}

	public RatingDto getRatingDto() {
		return ratingDto;
	}

	public void setRatingDto(RatingDto ratingDto) {
		this.ratingDto = ratingDto;
	}

	public OrderHistoryDto getOrderHistoryDto() {
		return orderHistoryDto;
	}

	public void setOrderHistoryDto(OrderHistoryDto orderHistoryDto) {
		this.orderHistoryDto = orderHistoryDto;
	}

	@Override
	public String toString() {
		return "OrderQueryDto [orderDto=" + orderDto + ", ratingDto=" + ratingDto + ", orderHistoryDto="
				+ orderHistoryDto + "]";
	}

}
