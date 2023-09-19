package com.pharma.order.dto;

import java.io.Serializable;
import java.util.UUID;

public class ItemDto implements Serializable {

	private static final long serialVersionUID = -8061980754316274610L;

	private Long itemId;
	private Long productCode;
	private String displayName;
	private Double quantity;
	private Double mrp;
	private Double ptr;
	private UUID orderGuid;
	private Double subTotalValue;

	public ItemDto() {
	}

	public ItemDto(Long itemId, Long productCode, String displayName, Double quantity, Double mrp, Double ptr,
			UUID orderGuid, Double subTotalValue) {
		super();
		this.itemId = itemId;
		this.productCode = productCode;
		this.displayName = displayName;
		this.quantity = quantity;
		this.mrp = mrp;
		this.ptr = ptr;
		this.orderGuid = orderGuid;
		this.subTotalValue = subTotalValue;
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

	public UUID getOrderGuid() {
		return orderGuid;
	}

	public void setOrderGuid(UUID orderGuid) {
		this.orderGuid = orderGuid;
	}

	public Double getSubTotalValue() {
		return subTotalValue;
	}

	public void setSubTotalValue(Double subTotalValue) {
		this.subTotalValue = subTotalValue;
	}

	@Override
	public String toString() {
		return "ItemDto [itemId=" + itemId + ", productCode=" + productCode + ", displayName=" + displayName
				+ ", quantity=" + quantity + ", mrp=" + mrp + ", ptr=" + ptr + ", orderGuid=" + orderGuid
				+ ", subTotalValue=" + subTotalValue + "]";
	}

}
