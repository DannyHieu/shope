package com.shope.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the category database table.
 * 
 */
@Entity
@Table(name="category")
@NamedQuery(name="Category.findAll", query="SELECT c FROM Category c")
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cate_id", unique=true, nullable=false, length=255)
	private String cateId;

	@Column(name="cate_img", nullable=false, length=255)
	private String cateImg;

	@Column(name="cate_name", nullable=false, length=255)
	private String cateName;

	public Category() {
	}

	public String getCateId() {
		return this.cateId;
	}

	public void setCateId(String cateId) {
		this.cateId = cateId;
	}

	public String getCateImg() {
		return this.cateImg;
	}

	public void setCateImg(String cateImg) {
		this.cateImg = cateImg;
	}

	public String getCateName() {
		return this.cateName;
	}

	public void setCateName(String cateName) {
		this.cateName = cateName;
	}

}