package com.zubair.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cust")
public class Customer {
	@Id
	@Column(name = "cust_id")
	private int custId;
	@Column(length = 20, name = "cust_name")
	private String custName;
	@Column(length = 12)
	private String mobile;
	
	@OneToMany(mappedBy = "cust", fetch = FetchType.EAGER)
	private Set<Payment> payments;
	
	public Customer() {
	}
	public Customer(int custId, String custName, String mobile) {
		this.custId = custId;
		this.custName = custName;
		this.mobile = mobile;
	}
	
	// Getters and Setters
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Set<Payment> getPayments() {
		return payments;
	}
	public void setPayments(Set<Payment> payments) {
		this.payments = payments;

	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", mobile=" + mobile + "]";
	}
}
