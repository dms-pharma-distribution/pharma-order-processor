package com.pharma.order.entity;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_history", schema = "oms_schema")
public class OrderHistoryEntity {
	@Id
	@Column(name = "history_id")
	private Long historyId;

	@Column(name = "event_type")
	private int eventType;

	@Column(name = "event_description")
	private String eventDescription;

		@Column(name = "event_timestamp")
	private LocalDateTime eventTimestamp;

	@Column(name = "event_source")
	private String eventSource;

	@Column(name = "updated_by")
	private String updatedBy;

	@Column(name = "previous_state")
	private String previousState;

	@Column(name = "new_state")
	private String newState;

	@JsonBackReference("order-history")
	@ManyToOne
	@JoinColumn(name = "order_guid")
	private OrderEntity orderEntity;

	public OrderHistoryEntity() {
	}

	public OrderHistoryEntity(Long historyId, int eventType, String eventDescription, LocalDateTime eventTimestamp,
			String eventSource, String updatedBy, String previousState, String newState,
			OrderEntity orderEntity) {
		this.historyId = historyId;
		this.eventType = eventType;
		this.eventDescription = eventDescription;
		this.eventTimestamp = eventTimestamp;
		this.eventSource = eventSource;
		this.updatedBy = updatedBy;
		this.previousState = previousState;
		this.newState = newState;
		this.orderEntity = orderEntity;
	}

	public Long getHistoryId() {
		return historyId;
	}

	public void setHistoryId(Long historyId) {
		this.historyId = historyId;
	}

	public int getEventType() {
		return eventType;
	}

	public void setEventType(int eventType) {
		this.eventType = eventType;
	}

	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	public LocalDateTime getEventTimestamp() {
		return eventTimestamp;
	}

	public void setEventTimestamp(LocalDateTime eventTimestamp) {
		this.eventTimestamp = eventTimestamp;
	}

	public String getEventSource() {
		return eventSource;
	}

	public void setEventSource(String eventSource) {
		this.eventSource = eventSource;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getPreviousState() {
		return previousState;
	}

	public void setPreviousState(String previousState) {
		this.previousState = previousState;
	}

	public String getNewState() {
		return newState;
	}

	public void setNewState(String newState) {
		this.newState = newState;
	}

	public OrderEntity getOrderEntity() {
		return orderEntity;
	}

	public void setOrderEntity(OrderEntity orderEntity) {
		this.orderEntity = orderEntity;
	}
}
