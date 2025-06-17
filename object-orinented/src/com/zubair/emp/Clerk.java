package com.zubair.emp;

public class Clerk extends Employee {
	private double incentives;
	
	public Clerk() {
	}

	public Clerk(String empName, double salary, double incentives) {
		super(empName, salary);
		this.incentives = incentives;
	}

	@Override
	public void payslip() {
		super.payslip();
		System.out.println("Incentives: " + incentives);
	}

	@Override
	public double getSalary() {
		return super.getSalary() + incentives;
	}
}
