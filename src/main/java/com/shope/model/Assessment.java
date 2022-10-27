package com.shope.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the assessment database table.
 * 
 */
@Entity
@Table(name="assessment")
@NamedQuery(name="Assessment.findAll", query="SELECT a FROM Assessment a")
public class Assessment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="assess_id", unique=true, nullable=false, length=255)
	private String assessId;

	@Column(name="assess_content", nullable=false)
	private String assessContent;

	@Column(name="assess_rate", nullable=false)
	private float assessRate;

	@Column(name="product_id", nullable=false, length=255)
	private String productId;

	@Column(name="user_id", nullable=false, length=255)
	private String userId;

	public Assessment() {
	}

	public String getAssessId() {
		return this.assessId;
	}

	public void setAssessId(String assessId) {
		this.assessId = assessId;
	}

	public String getAssessContent() {
		return this.assessContent;
	}

	public void setAssessContent(String assessContent) {
		this.assessContent = assessContent;
	}

	public float getAssessRate() {
		return this.assessRate;
	}

	public void setAssessRate(float assessRate) {
		this.assessRate = assessRate;
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}