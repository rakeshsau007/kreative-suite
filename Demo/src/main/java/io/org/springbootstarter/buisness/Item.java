package io.org.springbootstarter.buisness;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="list_items")
public class Item implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(name = "record_item_id")
	private Integer record_item_id;
	
	@Column(name = "item_name")
	private String item_name;
	
	@Column(name = "item_no")
	private Integer item_no;
	
	@Column(name = "quantity")
	private Integer  quantity;
	
	@Column(name = "price")
	private Double  price;

	public Integer getRecord_item_id() {
		return record_item_id;
	}

	public void setRecord_item_id(Integer record_item_id) {
		this.record_item_id = record_item_id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public Integer getItem_no() {
		return item_no;
	}

	public void setItem_no(Integer item_no) {
		this.item_no = item_no;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
}
