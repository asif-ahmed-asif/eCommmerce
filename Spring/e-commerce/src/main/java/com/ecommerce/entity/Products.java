package com.ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

@Entity
@Table(name="productsdummy1")
public class Products {
	
	@Id
	private String productId;
	@NotEmpty
	private String productName;
	@NotEmpty
	@ManyToOne
	private Category category;
	@NotEmpty
	@ManyToOne
	private Vendor vendor;
	@NotEmpty
	private String status;
	@Lob
	private byte[] thumbnail;
	@NotNull
	private double price;
	@NotEmpty
	private String description;
	
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public byte[] getThumbnail() {
		return thumbnail;
	}
	public Products setThumbnail(byte[] thumbnail) {
		this.thumbnail = thumbnail;
		return this;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Vendor getVendor() {
		return vendor;
	}
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
