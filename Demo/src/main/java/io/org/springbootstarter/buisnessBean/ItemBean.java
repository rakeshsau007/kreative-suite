package io.org.springbootstarter.buisnessBean;

public class ItemBean {

	private Integer record_item_id;
	private String item_name;
	private Integer item_no;
	private Integer  quantity;
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
