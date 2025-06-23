package com.zubair.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
public class Employee {
	@Id
	@GeneratedValue
	private int empNo;
	@Column(length = 20, name = "ename")
	private String empName;
	private double salary;
	
	@ManyToOne
	@JoinColumn(name = "deptNo")
	private Department dept;
	
	public Employee() {
	}
	public Employee(String empName, double salary) {
		this.empName = empName;
		this.salary = salary;
	}
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
}
