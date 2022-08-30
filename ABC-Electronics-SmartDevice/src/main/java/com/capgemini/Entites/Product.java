package com.capgemini.Entites;

import java.time.LocalDate;

public class Product {
	String modelNumber;
	String productName;
	String productCategoryName;
	LocalDate dateofPurchase;
	int warrantyYears;
	LocalDate warrantyDate;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String modelNumber, String productName, String productCategoryName, LocalDate dateofPurchase,
			int warrantyYears, LocalDate warrantyDate) {
		super();
		this.modelNumber = modelNumber;
		this.productName = productName;
		this.productCategoryName = productCategoryName;
		this.dateofPurchase = dateofPurchase;
		this.warrantyYears = warrantyYears;
		this.warrantyDate = warrantyDate;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCategoryName() {
		return productCategoryName;
	}
	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}
	public LocalDate getDateofPurchase() {
		return dateofPurchase;
	}
	public void setDateofPurchase(LocalDate dateofPurchase) {
		this.dateofPurchase = dateofPurchase;
	}
	public int getWarrantyYears() {
		return warrantyYears;
	}
	public void setWarrantyYears(int warrantyYears) {
		this.warrantyYears = warrantyYears;
	}
	public LocalDate getWarrantyDate() {
		return warrantyDate;
	}
	public void setWarrantyDate(LocalDate warrantyDate) {
		this.warrantyDate = warrantyDate;
	}
	@Override
	public String toString() {
		return "Product [modelNumber=" + modelNumber + ", productName=" + productName + ", productCategoryName="
				+ productCategoryName + ", dateofPurchase=" + dateofPurchase + ", warrantyYears=" + warrantyYears
				+ ", warrantyDate=" + warrantyDate + "]";
	}
	
	

}
