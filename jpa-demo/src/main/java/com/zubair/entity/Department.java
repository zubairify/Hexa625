package com.zubair.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "dept")
public class Department {
	@Id
	private int deptNo;
	@Column(length = 15, name = "dname")
	private String deptName;
	
	@OneToMany(mappedBy = "dept", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	private List<Employee> emps;
	
	public Department() {
	}

	public Department(int deptNo, String deptName) {
		this.deptNo = deptNo;
		this.deptName = deptName;
	}

	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Employee> getEmps() {
		return emps;
	}
	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}
	
}
