package com.masai.demo;



public class Car implements Vehicle{

	public void carStarted() {
		System.out.println("Car started running");
	}

	public void go() {
		carStarted();
		
	}


}
