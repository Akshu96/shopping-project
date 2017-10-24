package com.niit.backendmodel;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ORDERS")
public class orders implements Serializable {

	
	

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ORDER_ID")
	 String order_id;
	
	@Column(name="TOTAL_AMOUNT")
	 double total_payment;
	
	@Column(name="DELIVERY_ADDRESS")
	 String ship_address;
	
	@Column(name="NO_OF_ORDERS_MADE")
	 int no_of_orders;
	
	
	
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public double getTotal_payment() {
		return total_payment;
	}
	public void setTotal_payment(double total_payment) {
		this.total_payment = total_payment;
	}
	public String getShip_address() {
		return ship_address;
	}
	public void setShip_address(String ship_address) {
		this.ship_address = ship_address;
	}
	public int getNo_of_orders() {
		return no_of_orders;
	}
	public void setNo_of_orders(int no_of_orders) {
		this.no_of_orders = no_of_orders;
	}
	
}
