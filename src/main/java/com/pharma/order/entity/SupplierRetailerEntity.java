package com.pharma.order.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "supplier_retailer", schema = "oms_schema")
public class SupplierRetailerEntity {
	@Id
	@Column(name = "supplier_retailer_id")
	private Long supplierRetailerId;

	@Column(name = "retailer_code")
	private Long retailerCode;

	@Column(name = "supplier_code")
	private Long supplierCode;

	@Column(name = "supplier_store_code")
	private Long supplierStoreCode;

	@Column(name = "retailer_store_code")
	private Long retailerStoreCode;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "order_guid")
	private OrderEntity orderEntity;

	public SupplierRetailerEntity() {
	}

	public SupplierRetailerEntity(Long supplierRetailerId, Long retailerCode, Long supplierCode, Long supplierStoreCode,
			Long retailerStoreCode, OrderEntity orderEntity) {
		super();
		this.supplierRetailerId = supplierRetailerId;
		this.retailerCode = retailerCode;
		this.supplierCode = supplierCode;
		this.supplierStoreCode = supplierStoreCode;
		this.retailerStoreCode = retailerStoreCode;
		this.orderEntity = orderEntity;
	}

	public OrderEntity getOrderEntity() {
		return orderEntity;
	}

	public void setOrderEntity(OrderEntity orderEntity) {
		this.orderEntity = orderEntity;
	}

	public Long getSupplierRetailerId() {
		return supplierRetailerId;
	}

	public void setSupplierRetailerId(Long supplierRetailerId) {
		this.supplierRetailerId = supplierRetailerId;
	}

	public Long getRetailerCode() {
		return retailerCode;
	}

	public void setRetailerCode(Long retailerCode) {
		this.retailerCode = retailerCode;
	}

	public Long getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(Long supplierCode) {
		this.supplierCode = supplierCode;
	}

	public Long getSupplierStoreCode() {
		return supplierStoreCode;
	}

	public void setSupplierStoreCode(Long supplierStoreCode) {
		this.supplierStoreCode = supplierStoreCode;
	}

	public Long getRetailerStoreCode() {
		return retailerStoreCode;
	}

	public void setRetailerStoreCode(Long retailerStoreCode) {
		this.retailerStoreCode = retailerStoreCode;
	}

}
