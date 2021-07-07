package com.perfectsquare.spring.XMLConfig;

import java.beans.ConstructorProperties;

public class Product {

	private String productid;
	private String productName;
	private String productDesc;
	
	
	@ConstructorProperties({ "productid","productName","productDescription"})
	public Product(String productid, String productName, String productDesc) {
		super();
		this.productid = productid;
		this.productName = productName;
		this.productDesc = productDesc;
	}
	
	

	public String getProductid() {
		return productid;
	}



	public String getProductName() {
		return productName;
	}



	public String getProductDesc() {
		return productDesc;
	}



	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productName=" + productName + ", productDesc=" + productDesc
				+ "]";
	}
	
	
}
