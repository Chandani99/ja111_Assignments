package com.masai.Assignment2.Question5;

class Foo{
	public void doIt(int number){
		System.out.println("A");
	}

	public void doIt(String string){
		System.out.println("B");
	}
}
 
public class Bar extends Foo{
	public void doIt(float number){
		System.out.println("C");
	}
	
	public static void main(String args[]) {
		Bar x=new Bar();
		x.doIt("Hello");
	}
}
