package com.gowthamrajk.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Car")
public class Car {
	
	@Id
	private int carId;
	
	@Column(name = "name")
	private String carName;
	private String model;
	private double price;
	
	@OneToOne(targetEntity = Engine.class, cascade = CascadeType.ALL)  
	private Engine engine;
	
	public Car() { }

	public Car(int carId, String carName, String model, double price) {
		this.carId = carId;
		this.carName = carName;
		this.model = model;
		this.price = price;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		
		return "Car Details => ID : " + carId + ", Name : " + carName + ", Model : " + model + ", Price : " 
	            + price;
	}
}
