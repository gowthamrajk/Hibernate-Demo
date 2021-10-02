package com.gowthamrajk.oneclasstomultipletable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "Gadget")
@SecondaryTable(name = "Specification", pkJoinColumns = @PrimaryKeyJoinColumn(name = "gadgetId"))
public class Gadget {
	
	@Id
	@Column(name = "gadgetid")
	private int gadgetId;
	
	@Column(name = "gadgetname")
	private String gadgetName;
	
	private String description;
	
	@Column(table = "Specification")
	private double price;
	
	@Column(table = "Specification")
	private String type;
	
	@Column(table = "Specification")
	private int storage;

	public Gadget(int gadgetId, String gadgetName, String description, double price, String type, int storage) {
		this.gadgetId = gadgetId;
		this.gadgetName = gadgetName;
		this.description = description;
		this.price = price;
		this.type = type;
		this.storage = storage;
	}

	public int getGadgetId() {
		return gadgetId;
	}

	public void setGadgetId(int gadgetId) {
		this.gadgetId = gadgetId;
	}

	public String getGadgetName() {
		return gadgetName;
	}

	public void setGadgetName(String gadgetName) {
		this.gadgetName = gadgetName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	@Override
	public String toString() {
		return "Gadget Details => ID : " + gadgetId + ", Name : " + gadgetName + ", Description : " + description;
	}
}
