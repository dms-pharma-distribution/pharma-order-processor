package com.pharma.order.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "status", schema = "oms_schema")
public class OrderStatusEntity {
	@Id
	@Column(name = "status_code")
	private Integer statusCode;

	@Column(name = "description")
	private String description;

	public OrderStatusEntity() {
	}

	public OrderStatusEntity(Integer statusCode, String description) {
		super();
		this.statusCode = statusCode;
		this.description = description;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}