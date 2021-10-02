package com.gowthamrajk.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Developer")
public class Developer extends Employee {

	private int developerId;
	private String developerName;
	private String department;
	private int experience;
	
	public Developer() { }

	public Developer(int developerId, String developerName, String department, int experience) {
		this.developerId = developerId;
		this.developerName = developerName;
		this.department = department;
		this.experience = experience;
	}

	public int getDeveloperId() {
		return developerId;
	}

	public void setDeveloperId(int developerId) {
		this.developerId = developerId;
	}

	public String getDeveloperName() {
		return developerName;
	}

	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Developer Details => ID : " + developerId + ", Name : " + developerName + ", Department : "
				+ department + ", Working Experience : " + experience + " years";
	}
}
