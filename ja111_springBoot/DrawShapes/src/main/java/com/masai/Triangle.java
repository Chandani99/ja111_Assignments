package com.masai;

public class Triangle implements Shapes{
	public void creating() {
		System.out.println("you have drawn triangle");
	}

	@Override
	public void draw() {
		creating();
		
	}	

	
}
