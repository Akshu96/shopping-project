package com.niit.backendmodel;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class user implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="User_Id")
	private String user_id;
	
	@Column(name="USER_NAME")
	private String user_name;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="password")
	private String password;
	
	@Column(name="EMAIL_ID")
	private String email_id;
	
	@Column(name="PHONE_NUMBER")
	private long ph_no;
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public long getPh_no() {
		return ph_no;
	}
	public void setPh_no(long ph_no) {
		this.ph_no = ph_no;
	}
	
	

}
