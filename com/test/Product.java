package com.test;

public class Product {

	private String name;
	private String company;
	private double price;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(String name, String company, double price) {
		super();
		this.name = name;
		this.company = company;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", company=" + company + ", price=" + price + "]";
	}
	
	

}
