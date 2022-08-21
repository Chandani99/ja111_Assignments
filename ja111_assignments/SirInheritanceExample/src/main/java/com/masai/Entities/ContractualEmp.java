package com.masai.Entities;

public class ContractualEmp extends Employee{
	
	private int noOfWorkingDays;
	private int costPerDay;
	
	
	
	public ContractualEmp() {
	}



	public ContractualEmp(int noOfWorkingDays, int costPerDay) {
		this.noOfWorkingDays = noOfWorkingDays;
		this.costPerDay = costPerDay;
	}



	public int getNoOfWorkingDays() {
		return noOfWorkingDays;
	}



	public void setNoOfWorkingDays(int noOfWorkingDays) {
		this.noOfWorkingDays = noOfWorkingDays;
	}



	public int getCostPerDay() {
		return costPerDay;
	}



	public void setCostPerDay(int costPerDay) {
		this.costPerDay = costPerDay;
	}



	@Override
	public String toString() {
		return "ContractualEmp [noOfWorkingDays=" + noOfWorkingDays + ", costPerDay=" + costPerDay + "]";
	}
	
	
}
