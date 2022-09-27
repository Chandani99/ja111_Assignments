package com.masai.Assignment2.Question5;

public class Ractangle {
	 double width;
	 double length;

	 Ractangle(double width, double length) {
	     this.length = length;
	     this.width = width;
	 }
	 
	 
	public double getWidth() {
		if(width<0) {
			return 0;
		}
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getLength() {
		if(length<0) {
			return 0;
		}
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}

	public double getArea() {
         return length * width;
        
    }
	public static void main(String[] args) {
		Ractangle rct = new Ractangle(25, 5);
        System.out.println("Area " + rct.getArea());
        System.out.println("Length " + rct.getLength());
        System.out.println("Width " + rct.getWidth());

	}

}
