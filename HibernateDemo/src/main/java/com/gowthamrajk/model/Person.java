package com.gowthamrajk.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {
	
	@Id
	@Column(name = "id")
	private int personId;
	
	@Column(name = "name")
	private String personName;
	
	private int age;
	private String email;	
	private long mobile;
	
	@Embedded
	private Address address;
	
	public Person() { }
	
	public Person(int personId, String personName, int age, String email, long mobile) {
		this.personId = personId;
		this.personName = personName;
		this.age = age;
		this.email = email;
		this.mobile = mobile;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		
		return "Person Details => ID : " + personId + ", Name : " + personName + ", Age : " + age + ", Email : " 
		        + email + ", Mobile : " + mobile + address;
	}
}