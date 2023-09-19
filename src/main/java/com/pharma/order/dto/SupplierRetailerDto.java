package com.pharma.order.dto;

public class SupplierRetailerDto {
	private Long supplierRetailerId;
	private Long retailerCode;
	private Long supplierCode;
	private Long supplierStoreCode;
	private Long retailerStoreCode;

	public SupplierRetailerDto() {
	}

	public SupplierRetailerDto(Long supplierRetailerId, Long retailerCode, Long supplierCode, Long supplierStoreCode,
			Long retailerStoreCode) {
		super();
		this.supplierRetailerId = supplierRetailerId;
		this.retailerCode = retailerCode;
		this.supplierCode = supplierCode;
		this.supplierStoreCode = supplierStoreCode;
		this.retailerStoreCode = retailerStoreCode;
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
