package com.masai;

public class Calculator {
	private int a;
	private int b;
	

	public void setA(int num1) {
		this.a = (int)num1;
	}
	public void setB(int num2) {
		this.b = (int)num2;
	}
	public void sum()
	{
		System.out.println("sum of numbers:- "+(a+b));
	}
	public void multiplication()
	{
		System.out.println("multi of the numbers:- "+a*b);
	}
	public void subtraction()
	{
		System.out.println("substraction of numbers:- "+(a-b));
	}
	
}
