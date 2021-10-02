package com.gowthamrajk.manytomany;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class CabUser {
	
	@Id
    @Column(name = "userid")
    //@GeneratedValue(strategy = GenerationType.AUTO)
	private int cabUserId;
	
	@Column(name = "username")
	private String userName;
	
	private String email;
	private long mobile;
	private String location;
	
	@ManyToMany
	private List<Cab> cabList = new ArrayList<>();
	
	public CabUser() { }

	public CabUser(int cabUserId, String userName, String email, long mobile, String location) {
		this.cabUserId = cabUserId;
		this.userName = userName;
		this.email = email;
		this.mobile = mobile;
		this.location = location;
	}

	public int getCabUserId() {
		return cabUserId;
	}

	public void setCabUserId(int cabUserId) {
		this.cabUserId = cabUserId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Cab> getCabList() {
		return cabList;
	}

	public void setCabList(List<Cab> cabList) {
		this.cabList = cabList;
	}

	@Override
	public String toString() {
		
		return "CabUser Details => User ID : " + cabUserId + ", User Name : " + userName + ", Email : " + email 
				+ ", Mobile : " + mobile + ", Location : " + location;
	}
}
