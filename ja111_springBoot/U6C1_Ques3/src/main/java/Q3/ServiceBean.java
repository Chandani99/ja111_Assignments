package Q3;

import org.springframework.stereotype.Service;

@Service
public class ServiceBean {

	private int num1;
	private int num2;
	

	
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public void circle() {

		System.out.println("Area of Circle:- "+(3.141*num1*num1));
	}
	
	public void triangle() {

		System.out.println("Area of Triangle:- "+(.5*num1*num2));
	}
	
	public void rectangle() {

		System.out.println("Area of Rectangle:- "+(num1*num2));
	}
	public void sqaure() {

		System.out.println("Area of Sqaure:- "+(num1*num1));
	}
	
	
}
