package com.shope.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the invoice_detail database table.
 * 
 */
@Entity
@Table(name="invoice_detail")
@NamedQuery(name="InvoiceDetail.findAll", query="SELECT i FROM InvoiceDetail i")
public class InvoiceDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private InvoiceDetailPK id;

	@Column(name="indetail_price", nullable=false)
	private float indetailPrice;

	@Column(name="indetail_quantity", nullable=false)
	private int indetailQuantity;

	public InvoiceDetail() {
	}

	public InvoiceDetailPK getId() {
		return this.id;
	}

	public void setId(InvoiceDetailPK id) {
		this.id = id;
	}

	public float getIndetailPrice() {
		return this.indetailPrice;
	}

	public void setIndetailPrice(float indetailPrice) {
		this.indetailPrice = indetailPrice;
	}

	public int getIndetailQuantity() {
		return this.indetailQuantity;
	}

	public void setIndetailQuantity(int indetailQuantity) {
		this.indetailQuantity = indetailQuantity;
	}

}