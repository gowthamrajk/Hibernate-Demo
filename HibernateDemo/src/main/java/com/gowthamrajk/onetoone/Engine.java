package com.gowthamrajk.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Engine")
public class Engine {
	
	@Id
	@Column(name = "enginenumber")
	private int engineNumber;
	
	@Column(name = "enginetype")
	private String engineType;
	
	@Column(name = "capacity")
	private int capacity;
	
	@OneToOne(targetEntity = Car.class)  
	private Car car;
	
	public Engine() { }

	public Engine(int engineNumber, String engineType, int capacity) {
		this.engineNumber = engineNumber;
		this.engineType = engineType;
		this.capacity = capacity;
	}

	public int getEngineNumber() {
		return engineNumber;
	}

	public void setEngineNumber(int engineNumber) {
		this.engineNumber = engineNumber;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		
		return "Engine Details => Engine Number : " + engineNumber + ", Engine Type : " + engineType 
				+ ", Capacity : " + capacity;
	}
}
