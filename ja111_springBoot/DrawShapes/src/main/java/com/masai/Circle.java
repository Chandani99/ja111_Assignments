package com.masai;

public class Circle implements Shapes{
	public void creating() {
		System.out.println("you have drawn circle");
	}

	@Override
	public void draw() {
		creating();
		
	}	
	
}
