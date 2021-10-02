package com.gowthamrajk.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String doorNo;
	private String street;
	private String district;
	private String state;
	private int pincode;
	
	public Address() { }
	
	public Address(String doorNo, String street, String district, String state, int pincode) {
		this.doorNo = doorNo;
		this.street = street;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		
		return "Address => DoorNo : " + doorNo + ", Street : " + street + ", District : " + district 
				+ ", State : " + state + ", Pincode : " + pincode;
	}
}
