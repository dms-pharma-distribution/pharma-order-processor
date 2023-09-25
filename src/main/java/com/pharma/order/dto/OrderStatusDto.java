package com.pharma.order.dto;

public class OrderStatusDto {
	private int statusCode;
	private String description;

	public OrderStatusDto() {
	}

	public OrderStatusDto(int statusCode, String description) {
		super();
		this.statusCode = statusCode;
		this.description = description;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}