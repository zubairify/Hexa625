package com.zubair.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int rollNo;
	@Column(length = 20, name = "sname")
	private String studentName;
	@Column(length = 12)
	private String stream;
	private int age;
	
	public Student() {
	}

	public Student(int rollNo, String studentName, String stream, int age) {
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.stream = stream;
		this.age = age;
	}

	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", stream=" + stream + ", age=" + age
				+ "]";
	}
}
