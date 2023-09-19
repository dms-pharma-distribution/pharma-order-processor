package com.pharma.order.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "items", schema = "oms_schema")
public class ItemEntity implements Serializable{
	private static final long serialVersionUID = 3219886407778749677L;

	@Id
	@Column(name = "item_id")
	private Long itemId;

	@Column(name = "product_code")
	private Long productCode;

	@Column(name = "display_name")
	private String displayName;

	@Column(name = "quantity")
	private Double quantity;

	@Column(name = "mrp")
	private Double mrp;

	@Column(name = "ptr")
	private Double ptr;

	@Column(name = "sub_total_value")
	private Double subTotalValue;

	@JsonBackReference("order-item")
	@ManyToOne
	@JoinColumn(name = "order_guid")
	private OrderEntity orderEntity;

	public ItemEntity() {
	}

	public ItemEntity(Long itemId, Long productCode, String displayName, Double quantity, Double mrp, Double ptr,
			Double subTotalValue, OrderEntity orderEntity) {
		super();
		this.itemId = itemId;
		this.productCode = productCode;
		this.displayName = displayName;
		this.quantity = quantity;
		this.mrp = mrp;
		this.ptr = ptr;
		this.subTotalValue = subTotalValue;
		this.orderEntity = orderEntity;
	}

	public OrderEntity getOrderEntity() {
		return orderEntity;
	}

	public void setOrderEntity(OrderEntity orderEntity) {
		this.orderEntity = orderEntity;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getProductCode() {
		return productCode;
	}

	public void setProductCode(Long productCode) {
		this.productCode = productCode;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getMrp() {
		return mrp;
	}

	public void setMrp(Double mrp) {
		this.mrp = mrp;
	}

	public Double getPtr() {
		return ptr;
	}

	public void setPtr(Double ptr) {
		this.ptr = ptr;
	}

	public Double getSubTotalValue() {
		return subTotalValue;
	}

	public void setSubTotalValue(Double subTotalValue) {
		this.subTotalValue = subTotalValue;
	}

}
