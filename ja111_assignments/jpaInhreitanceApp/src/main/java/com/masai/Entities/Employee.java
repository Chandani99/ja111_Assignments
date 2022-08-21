package com.masai.Entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.OneToOne;

@Entity

public class Employee extends Person {
	
	private Address homeAddress;
	
	private Address officeAddress; 
	
	
	
	public Employee() {
	}



	public Employee(Address homeAddress, Address officeAddress) {
		this.homeAddress = homeAddress;
		this.officeAddress = officeAddress;
	}



	public Address getHomeAddress() {
		return homeAddress;
	}



	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}



	public Address getOfficeAddress() {
		return officeAddress;
	}



	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}



	@Override
	public String toString() {
		return "Employee [homeAddress=" + homeAddress + ", officeAddress=" + officeAddress + "]";
	}
	
	
	
}
