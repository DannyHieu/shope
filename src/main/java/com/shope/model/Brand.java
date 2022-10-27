 package com.shope.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the brand database table.
 * 
 */
@Entity
@Table(name="brand")
@NamedQuery(name="Brand.findAll", query="SELECT b FROM Brand b")
public class Brand implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="brand_id", unique=true, nullable=false, length=255)
	private String brandId;

	@Column(name="brand_img", nullable=false, length=255)
	private String brandImg;

	@Column(name="brand_name", nullable=false, length=255)
	private String brandName;

	public Brand() {
	}

	public String getBrandId() {
		return this.brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getBrandImg() {
		return this.brandImg;
	}

	public void setBrandImg(String brandImg) {
		this.brandImg = brandImg;
	}

	public String getBrandName() {
		return this.brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

}