package com.masai.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {
	
	@Id
    private int empId;
    private String name;
    private String address;
    private int salary;
    
    
    
    public Emp() {
	}
    
    
	public Emp(int empId, String name, String address, int salary) {
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	public int getEid() {
		return empId;
	}
	public void setEid(int eid) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
    
	
}
