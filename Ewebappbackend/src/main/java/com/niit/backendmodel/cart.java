package com.niit.backendmodel;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity	
@Table(name="Cart")
public class cart implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column(name="CART_ID")
	 String cartId;
	

	public String getCartId() {
		return cartId;
	}
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}
	@Column(name="PRODUCT_ID")
	 String productId;
	
	
	@Column(name="SUPPLIER_ID")
	 String supplierId;
	
	
	@Column(name="PRODUCT_PRICE")
	 double prodprice;
	
	
	@Column(name="QUANTITY_OF_PRODUCT")
	 int quantity;
	
	
	@Column(name="STATUS_OF_PURCHASE")
	 String status_of_product;
	
	
	
	
		
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	public double getProdprice() {
		return prodprice;
	}
	public void setProdprice(int prodprice) {
		this.prodprice = prodprice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getStatus_of_product() {
		return status_of_product;
	}
	public void setStatus_of_product(String status_of_product) {
		this.status_of_product = status_of_product;
	}
	

}
