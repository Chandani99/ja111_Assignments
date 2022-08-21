package com.masai;

public class B {
    private A a;
    
    public void displayMsg1() {
 		System.out.println("Inside B's display function");
 	}
//     to avoide dependency
    public void setA(A a) {
        this.a = a;
    }
}
