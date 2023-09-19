package com.pharma.order.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class OrderDto {

	private UUID orderGuid;
	private Long orderCode;
	private Integer totalProducts;
	private Double totalQuantity;
	private Double totalOrderValue;
	private Double totalGstValue;
	private String paymentStatus;
	private Boolean isFavourite;
	private String createdBy;
	private String sourceType;	
	private LocalDateTime createdDate;	
	private OrderStatusDto orderStatusDto;
	private SupplierRetailerDto supplierRetailerDto;
	private List<ItemDto> itemDtos;

	public OrderDto() {
	}

	public OrderDto(UUID orderGuid, Long orderCode, Integer totalProducts, Double totalQuantity, Double totalOrderValue,
			Double totalGstValue, String paymentStatus, Boolean isFavourite, String createdBy, String sourceType,
			LocalDateTime createdDate, OrderStatusDto orderStatusDto, SupplierRetailerDto supplierRetailerDto,
			List<ItemDto> itemDtos) {
		super();
		this.orderGuid = orderGuid;
		this.orderCode = orderCode;
		this.totalProducts = totalProducts;
		this.totalQuantity = totalQuantity;
		this.totalOrderValue = totalOrderValue;
		this.totalGstValue = totalGstValue;
		this.paymentStatus = paymentStatus;
		this.isFavourite = isFavourite;
		this.createdBy = createdBy;
		this.sourceType = sourceType;
		this.createdDate = createdDate;
		this.orderStatusDto = orderStatusDto;
		this.supplierRetailerDto = supplierRetailerDto;
		this.itemDtos = itemDtos;
	}

	public void setSupplierRetailerDto(SupplierRetailerDto supplierRetailerDto) {
		this.supplierRetailerDto = supplierRetailerDto;
	}

	public OrderStatusDto getOrderStatusDto() {
		return orderStatusDto;
	}

	public void setOrderStatusDto(OrderStatusDto orderStatusDto) {
		this.orderStatusDto = orderStatusDto;
	}

	public UUID getOrderGuid() {
		return orderGuid;
	}

	public void setOrderGuid(UUID orderGuid) {
		this.orderGuid = orderGuid;
	}

	public Integer getTotalProducts() {
		return totalProducts;
	}

	public void setTotalProducts(Integer totalProducts) {
		this.totalProducts = totalProducts;
	}

	public Double getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(Double totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public Double getTotalOrderValue() {
		return totalOrderValue;
	}

	public void setTotalOrderValue(Double totalOrderValue) {
		this.totalOrderValue = totalOrderValue;
	}

	public Double getTotalGstValue() {
		return totalGstValue;
	}

	public void setTotalGstValue(Double totalGstValue) {
		this.totalGstValue = totalGstValue;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Boolean getIsFavourite() {
		return isFavourite;
	}

	public void setIsFavourite(Boolean isFavourite) {
		this.isFavourite = isFavourite;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public Long getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(Long orderCode) {
		this.orderCode = orderCode;
	}

	public SupplierRetailerDto getSupplierRetailerDto() {
		return supplierRetailerDto;
	}

	public List<ItemDto> getItemDtos() {
		return itemDtos;
	}

	public void setItemDtos(List<ItemDto> itemDtos) {
		this.itemDtos = itemDtos;
	}

	@Override
	public String toString() {
		return "OrderDto [orderGuid=" + orderGuid + ", orderCode=" + orderCode + ", totalProducts=" + totalProducts
				+ ", totalQuantity=" + totalQuantity + ", totalOrderValue=" + totalOrderValue + ", totalGstValue="
				+ totalGstValue + ", paymentStatus=" + paymentStatus + ", isFavourite=" + isFavourite + ", createdBy="
				+ createdBy + ", sourceType=" + sourceType + ", createdDate=" + createdDate + ", orderStatusDto="
				+ orderStatusDto + ", supplierRetailerDto=" + supplierRetailerDto + ", itemDtos=" + itemDtos + "]";
	}
}
