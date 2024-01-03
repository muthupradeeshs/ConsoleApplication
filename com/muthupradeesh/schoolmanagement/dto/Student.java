package com.muthupradeesh.schoolmanagement.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {
	private int rollNumber;
	private String course;
	private int totalfees;
	private int remainingFees;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getTotalfees() {
		return totalfees;
	}

	public void setTotalfees(int totalfees) {
		this.totalfees = totalfees;
	}

	public int getRemainingFees() {
		return remainingFees;
	}

	public void setRemainingFees(int remainingFees) {
		this.remainingFees = remainingFees;
	}

}
