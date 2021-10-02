package com.gowthamrajk.manytoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Owner {
	
    @Id
    @Column(name = "ownerid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ownerId;

	@Column(name = "ownername")
    private String ownerName;
	
	private String location;
	private long mobile;

	public Owner() { }

	public Owner(String ownerName, String location, long mobile) {
		this.ownerName = ownerName;
		this.location = location;
		this.mobile = mobile;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		
		return "Owner Details => ID : " + ownerId + ", Name : " + ownerName + ", Location : " + location 
				+ ", Mobile : " + mobile;
	}
}