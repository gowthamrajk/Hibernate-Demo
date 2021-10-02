package com.gowthamrajk.manytoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle {
	
	@Id
    @Column(name = "vehicleid")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int vehicleId;
	
	@Column(name = "vehiclename")
	private String vehicleName;
	
	@ManyToOne
	@JoinColumn(name = "ownerid")
	private Owner owner;

	public Vehicle() { }

	public Vehicle(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		
		return "Vehicle Details => Vehicle ID : " + vehicleId + ", Vehicle Name : " + vehicleName + owner;
	}
}
