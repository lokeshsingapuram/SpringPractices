package com.tcs.beans;

public class Product {
	private int id;
	private String prodName;
	private String prodPrice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(String prodPrice) {
		this.prodPrice = prodPrice;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", prodName=" + prodName + ", prodPrice=" + prodPrice + "]";
	}
	

}
