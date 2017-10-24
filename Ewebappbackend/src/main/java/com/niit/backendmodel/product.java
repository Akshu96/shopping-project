package com.niit.backendmodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="PRODUCT")
public class product {

	
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="PRODUCT_ID")
	private String pro_id;
	
	

	@Column(name="PRODUCT_NAME")
	private String pro_name;
	
	@Column(name="BRAND_NAME")
	private String pro_brand_name;
	
	@Column(name="DESCRIPTION")
	private String pro_desc;
	
	@Column(name="PRICE")
	private String pro_price;
	
	
	
	public String getPro_id() {
		return pro_id;
	}
	public void setPro_id(String pro_id) {
		this.pro_id = pro_id;
	}
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	public String getPro_brand_name() {
		return pro_brand_name;
	}
	public void setPro_brand_name(String pro_brand_name) {
		this.pro_brand_name = pro_brand_name;
	}
	public String getPro_desc() {
		return pro_desc;
	}
	public void setPro_desc(String pro_desc) {
		this.pro_desc = pro_desc;
	}
	public String getPro_price() {
		return pro_price;
	}
	public void setPro_price(String pro_price) {
		this.pro_price = pro_price;
	}
	
	
}
