package com.gowthamrajk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "EmployeeInheritance")
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee {
	
	@Id
	@Column(name = "id")
	private int empId;
	
	@Column(name = "name")
	private String empName;
	
	private double salary;
	private String email;	
	private long mobile;
	
	public Employee() { }
	
	public Employee(int empId, String empName, double salary, String email, long mobile) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.email = email;
		this.mobile = mobile;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
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

	@Override
	public String toString() {
		
		return "Employee Details => ID : " + empId + ", Name : " + empName + ", Salary : " + salary + ", Email : " 
		        + email + ", Mobile : " + mobile;
	}
}