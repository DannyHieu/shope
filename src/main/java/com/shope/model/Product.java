package com.shope.model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;


/**
 * The persistent class for the product database table.
 * 
 */
@Data
@Entity
@Table(name="product")
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="product_id", unique=true, nullable=false, length=255)
	private String productId;

	@Column(name="brand_id", length=255)
	private String brandId;

	@Column(name="cate_id", length=255)
	private String cateId;

	@Column(name="product_description", nullable=false)
	private String productDescription;

	@Column(name="product_img", nullable=false, length=255)
	private String productImg;

	@Column(name="product_inventory")
	private int productInventory;

	@Column(name="product_name", nullable=false, length=255)
	private String productName;

	@Column(name="product_price", nullable=false)
	private float productPrice;

	@Column(name="product_promotion")
	private int productPromotion;

//	public Product() {
//	}
//
//	public String getProductId() {
//		return this.productId;
//	}
//
//	public void setProductId(String productId) {
//		this.productId = productId;
//	}
//
//	public String getBrandId() {
//		return this.brandId;
//	}
//
//	public void setBrandId(String brandId) {
//		this.brandId = brandId;
//	}
//
//	public String getCateId() {
//		return this.cateId;
//	}
//
//	public void setCateId(String cateId) {
//		this.cateId = cateId;
//	}
//
//	public Object getProductDescription() {
//		return this.productDescription;
//	}
//
//	public void setProductDescription(String productDescription) {
//		this.productDescription = productDescription;
//	}
//
//	public String getProductImg() {
//		return this.productImg;
//	}
//
//	public void setProductImg(String productImg) {
//		this.productImg = productImg;
//	}
//
//	public int getProductInventory() {
//		return this.productInventory;
//	}
//
//	public void setProductInventory(int productInventory) {
//		this.productInventory = productInventory;
//	}
//
//	public String getProductName() {
//		return this.productName;
//	}
//
//	public void setProductName(String productName) {
//		this.productName = productName;
//	}
//
//	public float getProductPrice() {
//		return this.productPrice;
//	}
//
//	public void setProductPrice(float productPrice) {
//		this.productPrice = productPrice;
//	}
//
//	public int getProductPromotion() {
//		return this.productPromotion;
//	}
//
//	public void setProductPromotion(int productPromotion) {
//		this.productPromotion = productPromotion;
//	}

}