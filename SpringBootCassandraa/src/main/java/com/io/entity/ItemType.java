package com.io.entity;

import org.springframework.data.cassandra.mapping.Table;

@Table("itemtype")
public class ItemType {
	
	
	private String itemCode;
	private String itemName;
	private float itemPrice;
	
	
	
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	
	
	
}
