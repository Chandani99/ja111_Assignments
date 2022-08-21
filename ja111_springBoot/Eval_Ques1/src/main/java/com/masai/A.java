package com.masai;

public class A {
     private B b;
     
     public void displayMsg() {
 		System.out.println("Inside A's display function");
 	}
//     To avoide dependency
     public void setB(B b) {
         this.b = b;
     }
}
