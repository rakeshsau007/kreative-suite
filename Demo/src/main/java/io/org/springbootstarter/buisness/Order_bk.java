package io.org.springbootstarter.buisness;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="order_data")
public class Order_bk implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public Long getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}

	public double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}

	public Date getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(Date creation_date) {
		this.creation_date = creation_date;
	}

	public Date getModified_date() {
		return modified_date;
	}

	public void setModified_date(Date modified_date) {
		this.modified_date = modified_date;
	}

	public String getOrder_status() {
		return order_status;
	}

	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(name = "order_id")
	private Long order_id;
	
	
	@Column(name = "total_price")
	private double total_price;
	
	@Column(name = "creation_date")
	private Date creation_date;
	
	
	@Column(name = "modified_date")
	private Date modified_date;
	
	@Column(name = "order_status")
	private String order_status;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "state")
	private String state;

}
