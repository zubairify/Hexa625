package com.zubair.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "payments")
public class Payment {
	@Id
	@GeneratedValue
	private int payId;
	@Column(length = 20)
	private String vendor;
	private LocalDate payDate;
	private double amount;
	
	@ManyToOne
	@JoinColumn(name = "cust_id")
	private Customer cust;
	
	public Payment() {
	}
	public Payment(String vendor, LocalDate payDate, double amount) {
		this.vendor = vendor;
		this.payDate = payDate;
		this.amount = amount;
	}
	
	public int getPayId() {
		return payId;
	}
	public void setPayId(int payId) {
		this.payId = payId;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public LocalDate getPayDate() {
		return payDate;
	}
	public void setPayDate(LocalDate payDate) {
		this.payDate = payDate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Customer getCust() {
		return cust;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	
	@Override
	public String toString() {
		return "Payment [payId=" + payId + ", vendor=" + vendor + ", payDate=" + payDate + ", amount=" + amount + "]";
	}
}
