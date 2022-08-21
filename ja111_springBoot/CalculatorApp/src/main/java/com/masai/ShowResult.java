package com.masai;

public class ShowResult {
	
	private Calculator service;


	public void setService(Calculator service) {
		this.service = service;
	}
	public void result()
	{
		service.sum();
		service.subtraction();
		service.multiplication();
	}
	
}
