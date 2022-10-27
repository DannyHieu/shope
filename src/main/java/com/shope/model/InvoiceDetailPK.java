package com.shope.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the invoice_detail database table.
 * 
 */
@Embeddable
public class InvoiceDetailPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="invoice_id", unique=true, nullable=false, length=255)
	private String invoiceId;

	@Column(name="product_id", unique=true, nullable=false, length=255)
	private String productId;

	public InvoiceDetailPK() {
	}
	public String getInvoiceId() {
		return this.invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof InvoiceDetailPK)) {
			return false;
		}
		InvoiceDetailPK castOther = (InvoiceDetailPK)other;
		return 
			this.invoiceId.equals(castOther.invoiceId)
			&& this.productId.equals(castOther.productId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.invoiceId.hashCode();
		hash = hash * prime + this.productId.hashCode();
		
		return hash;
	}
}