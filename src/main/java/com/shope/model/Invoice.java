package com.shope.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the invoice database table.
 * 
 */
@Entity
@Table(name="invoice")
@NamedQuery(name="Invoice.findAll", query="SELECT i FROM Invoice i")
public class Invoice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="invoice_id", unique=true, nullable=false, length=255)
	private String invoiceId;

	@Column(name="invoice_date", nullable=false)
	private Timestamp invoiceDate;

	@Column(name="user_id", nullable=false, length=255)
	private String userId;

	public Invoice() {
	}

	public String getInvoiceId() {
		return this.invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Timestamp getInvoiceDate() {
		return this.invoiceDate;
	}

	public void setInvoiceDate(Timestamp invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}