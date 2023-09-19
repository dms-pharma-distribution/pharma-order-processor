package com.pharma.order.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public class OrderHistoryDto {
	
	private long historyId;
	private int eventType;
	private String eventDescription;
	private LocalDateTime eventTimestamp;
	private String eventSource;
	private String updatedBy;
	private UUID orderGuid;
	private String previousState;
	private String newState;

	public OrderHistoryDto() {
		super();
	}

	public OrderHistoryDto(long historyId, int eventType, String eventDescription, LocalDateTime eventTimestamp,
			String eventSource, String updatedBy, UUID orderGuid, String previousState, String newState) {
		super();
		this.historyId = historyId;
		this.eventType = eventType;
		this.eventDescription = eventDescription;
		this.eventTimestamp = eventTimestamp;
		this.eventSource = eventSource;
		this.updatedBy = updatedBy;
		this.orderGuid = orderGuid;
		this.previousState = previousState;
		this.newState = newState;
	}

	public long getHistoryId() {
		return historyId;
	}

	public void setHistoryId(long historyId) {
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

	public UUID getOrderGuid() {
		return orderGuid;
	}

	public void setOrderGuid(UUID orderGuid) {
		this.orderGuid = orderGuid;
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
}
