package com.gowthamrajk.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Tester")
public class Tester extends Employee {
	
	private int testerId;
	private String testerName;
	private String department;
	private int bugsIdentified;
	
	public Tester() { }
	
	public Tester(int testerId, String testerName, String department, int bugsIdentified) {
		this.testerId = testerId;
		this.testerName = testerName;
		this.department = department;
		this.bugsIdentified = bugsIdentified;
	}

	public int getTesterId() {
		return testerId;
	}

	public void setTesterId(int testerId) {
		this.testerId = testerId;
	}

	public String getTesterName() {
		return testerName;
	}

	public void setTesterName(String testerName) {
		this.testerName = testerName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getBugsIdentified() {
		return bugsIdentified;
	}

	public void setBugsIdentified(int bugsIdentified) {
		this.bugsIdentified = bugsIdentified;
	}

	@Override
	public String toString() {
		
		return "Tester Details => ID : " + testerId + ", Name : " + testerName + ", Department : " + department
				+ ", Bugs Identified : " + bugsIdentified;
	}
}
