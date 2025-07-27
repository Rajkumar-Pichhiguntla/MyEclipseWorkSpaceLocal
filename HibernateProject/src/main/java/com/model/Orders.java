package com.model;

public class Orders {
	
	private int orderId;
	private int customerId;
	private String product;
	private int quantity;
	private int price;
	public Orders(int orderId, int customerId, String product, int quantity, int price) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.product = product;
		this.quantity = quantity;
		this.price = price;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", customerId=" + customerId + ", product=" + product + ", quantity="
				+ quantity + ", price=" + price + "]";
	}
	

}
