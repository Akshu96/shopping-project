package com.niit.backendmodel;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SUPPLIER")
public class supplier implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="SUPPLIER_ID")
	private String su_id;
	
	@Column(name="SUPPLIER_NAME")
	private String su_name;
	
	
	public String getSu_id() {
		return su_id;
	}
	public void setSu_id(String su_id) {
		this.su_id = su_id;
	}
	public String getSu_name() {
		return su_name;
	}
	public void setSu_name(String su_name) {
		this.su_name = su_name;
	}
	

}
