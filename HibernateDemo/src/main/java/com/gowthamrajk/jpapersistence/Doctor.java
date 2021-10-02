package com.gowthamrajk.jpapersistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
public class Doctor {
	
	@Id
	@Column(name = "doctorid")
	private int doctorId;
	
	@Column(name = "doctorname")
	private String doctorName;
	
	private String email;
	private String specializaion;
	private int experience;
	
	public Doctor() { }

	public Doctor(int doctorId, String doctorName, String email, String specializaion, int experience) {
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.email = email;
		this.specializaion = specializaion;
		this.experience = experience;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSpecializaion() {
		return specializaion;
	}

	public void setSpecializaion(String specializaion) {
		this.specializaion = specializaion;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		
		return "\nDoctor Details => Doctor ID : " + doctorId + ", Doctor Name : " + doctorName + ", Email : " 
		        + email + ", Specializaion : " + specializaion + ", Experience : " + experience + " years";
	}
}
