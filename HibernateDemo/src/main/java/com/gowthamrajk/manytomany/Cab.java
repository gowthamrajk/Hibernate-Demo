package com.gowthamrajk.manytomany;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Cab {
	
	@Id
    @Column(name = "cabid")
    //@GeneratedValue(strategy = GenerationType.AUTO)
	private int cabId;
	
	@Column(name = "cabname")
	private String cabName;
	 
	@Column(name = "cabtype")
	private String cabType;
	 
	@Column(name = "basepay")
	private double basePay;
	
	@ManyToMany(mappedBy = "cabList")
	private List<CabUser> userList = new ArrayList<>();
	
	public Cab() { }

	public Cab(int cabId, String cabName, String cabType, double basePay) {
		this.cabId = cabId;
		this.cabName = cabName;
		this.cabType = cabType;
		this.basePay = basePay;
	}

	public int getCabId() {
		return cabId;
	}

	public void setCabId(int cabId) {
		this.cabId = cabId;
	}

	public String getCabName() {
		return cabName;
	}

	public void setCabName(String cabName) {
		this.cabName = cabName;
	}

	public String getCabType() {
		return cabType;
	}

	public void setCabType(String cabType) {
		this.cabType = cabType;
	}

	public double getBasePay() {
		return basePay;
	}

	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}

	public List<CabUser> getUserList() {
		return userList;
	}

	public void setUserList(List<CabUser> userList) {
		this.userList = userList;
	}

	@Override
	public String toString() {
		
		return "Cab Details => ID : " + cabId + ", Cab Name : " + cabName + ", Type : " + cabType 
				+ ", Base Pay : " + basePay;
	}
}
