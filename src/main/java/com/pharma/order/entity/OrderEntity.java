package com.pharma.order.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders", schema = "oms_schema")
public class OrderEntity implements Serializable{
	
	private static final long serialVersionUID = 3740191511253350299L;

	@Id
	@Column(name = "order_guid")
	private UUID orderGuid;

	@Column(name = "total_products")
	private Integer totalProducts;

	@Column(name = "total_quantity")
	private Double totalQuantity;

	@Column(name = "total_order_value")
	private Double totalOrderValue;

	@Column(name = "total_gst_value")
	private Double totalGstValue;

	@Column(name = "payment_status")
	private String paymentStatus;

	@Column(name = "is_favourite")
	private Boolean isFavourite;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "source_type")
	private String sourceType;

	@Column(name = "created_date")
	private LocalDateTime createdDate;

	@Column(name = "order_code")
	private Long orderCode;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "status_code")
	private OrderStatusEntity orderStatusEntity;

	@JoinColumn(name = "supplier_retailer_id")
	@OneToOne(mappedBy = "orderEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private SupplierRetailerEntity supplierRetailerEntity;

	@JsonManagedReference("order-item")
	@OneToMany(mappedBy = "orderEntity", cascade = CascadeType.ALL)
	private List<ItemEntity> itemEntities;

	@JsonManagedReference("order-history")
	@OneToMany(mappedBy = "orderEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<OrderHistoryEntity> orderHistoryEntity;

	public OrderEntity() {
	}

	public OrderEntity(UUID orderGuid, Integer totalProducts, Double totalQuantity, Double totalOrderValue,
			Double totalGstValue, String paymentStatus, Boolean isFavourite, String createdBy, String sourceType,
			LocalDateTime createdDate, Long orderCode, OrderStatusEntity orderStatusEntity,
			SupplierRetailerEntity supplierRetailerEntity, List<ItemEntity> itemEntities,
			List<OrderHistoryEntity> orderHistoryEntity) {
		this.orderGuid = orderGuid;
		this.totalProducts = totalProducts;
		this.totalQuantity = totalQuantity;
		this.totalOrderValue = totalOrderValue;
		this.totalGstValue = totalGstValue;
		this.paymentStatus = paymentStatus;
		this.isFavourite = isFavourite;
		this.createdBy = createdBy;
		this.sourceType = sourceType;
		this.createdDate = createdDate;
		this.orderCode = orderCode;
		this.orderStatusEntity = orderStatusEntity;
		this.supplierRetailerEntity = supplierRetailerEntity;
		this.itemEntities = itemEntities;
		this.orderHistoryEntity = orderHistoryEntity;
	}

	public SupplierRetailerEntity getSupplierRetailerEntity() {
		return supplierRetailerEntity;
	}

	public void setSupplierRetailerEntity(SupplierRetailerEntity supplierRetailerEntity) {
		this.supplierRetailerEntity = supplierRetailerEntity;
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

	public OrderStatusEntity getOrderStatusEntity() {
		return orderStatusEntity;
	}

	public void setOrderStatusEntity(OrderStatusEntity orderStatusEntity) {
		this.orderStatusEntity = orderStatusEntity;
	}

	public Long getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(Long orderCode) {
		this.orderCode = orderCode;
	}

	public List<ItemEntity> getItemEntities() {
		return itemEntities;
	}

	public void setItemEntities(List<ItemEntity> itemEntities) {
		this.itemEntities = itemEntities;
	}

	public List<OrderHistoryEntity> getOrderHistoryEntity() {
		return orderHistoryEntity;
	}

	public void setOrderHistoryEntity(List<OrderHistoryEntity> orderHistoryEntity) {
		this.orderHistoryEntity = orderHistoryEntity;
	}
}
