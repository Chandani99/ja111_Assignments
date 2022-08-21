package com.masai.demo;

public class Travell {
    Vehicle v;

	public void setV(Vehicle v) {
		this.v = v;
	}
    
	public void journey() {
		v.go();
		System.out.println("Journey strated");
	}
}
