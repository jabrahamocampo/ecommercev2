package com.jaom.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productcategories")
public class ProductCategories {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long CategoryID;
	private String CategoryName;
	
	public ProductCategories() {
		super();
	}
	
	public ProductCategories(Long CategoryID, String CategoryName) {
		super();
		this.CategoryID = CategoryID;
		this.CategoryName = CategoryName;
	}

	public Long getCategoryId() {
		return CategoryID;
	}

	public void setCategoryId(Long CategoryID) {
		this.CategoryID = CategoryID;
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String CategoryName) {
		this.CategoryName = CategoryName;
	}

	@Override
	public String toString() {
		return "ProductCategories [CategoryID=" + CategoryID + ", CategoryName=" + CategoryName + "]";
	}
	
}
