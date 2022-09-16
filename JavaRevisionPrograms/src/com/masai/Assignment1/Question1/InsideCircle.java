package com.masai.Assignment1.Question1;

import java.util.Scanner;

public class InsideCircle {
    public static void isInCircle(int x,int y) throws NegativeNumber {
    	 if(x<0 || y<0) {
    		 throw new NegativeNumber("Please enter non negative number");
    	 }
         else {
	    	if(x*2<=10 && y*2<=10) {
	    		System.out.println("The points ("+x+","+y+") are Inside the circle");
	    	}
	    	else if(x*2<=10 && y*2>10) {
	    		System.out.println("The points "+x+" is inside the circle, "+y+" is not Inside the circle");
	    	}
	    	else if(x*2>10 && y*2<=10) {
	    		System.out.println("The points "+x+" is not inside the circle, "+y+" is Inside the circle");
	
	    	}
	    	else {
	    		System.out.println("The points ("+x+","+y+") are not Inside the circle");
	    	}
	    }
	    
    }
	public static void main(String[] args) throws NegativeNumber {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter point x");
		int x=sc.nextInt();
		System.out.println("Enter point y");
		int y=sc.nextInt();
		
		isInCircle(x,y);

	}

}
