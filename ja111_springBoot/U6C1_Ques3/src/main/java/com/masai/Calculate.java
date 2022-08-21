package com.masai;

import org.springframework.stereotype.Service;

@Service
public class Calculate {

	private int a;
	private int b;
	

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void circle() {

		System.out.println("Area of Circle:- "+(3.141*a*a));
	}
	
	public void triangle() {

		System.out.println("Area of Triangle:- "+(.5*a*b));
	}
	
	public void rectangle() {

		System.out.println("Area of Rectangle:- "+(a*b));
	}
	public void sqaure() {

		System.out.println("Area of Sqaure:- "+(a*a));
	}
	
	
}
