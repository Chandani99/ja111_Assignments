package DSA_Day1;

import java.util.Arrays;

public class Matrix {
	 static String check(int[][]mat) {
	//	 for checking horzontal=============
		 boolean flag=false;
		 for(int i=0; i<mat.length; i++) {
			 String hori="";
			 for(int j=0; j<mat[i].length; j++) {
				 if(mat[i][j]==1) {
					 hori+=mat[i][j];
				 }
			 }
			 if(hori.length()==mat.length)
			 flag=true;
		 }
	//	Vertical Check=====================
		 
		 boolean flag2=false;
		 for(int i=0; i<mat.length; i++) {
			 String ver="";
			 for(int j=0; j<mat[i].length; j++) {
				 if(mat[j][i]==1) {
					 ver+=mat[j][i];
				 }
			 }
			 if(ver.length()==mat.length)
			 flag2=true;
		 }
		 
	//	 LeftDiagonal======================
		 String leftDi="";
		 for(int i=0; i<mat.length; i++) {
			 if(mat[i][i]==1) {
				 leftDi+=mat[i][i];
			 }
		 }
	//	 Right Diagonal===================
		 String rightDi="";
	    for(int i=0; i<mat.length; i++){
			 for(int j=0; j<mat[i].length; j++) {
				 if(i+j==mat.length-1) {
					 if(mat[i][j]==1) {
						rightDi+=mat[i][j]; 
					 }
				 }
			 }
		 }
	    
	    System.out.println("=======================");
	    
	    if(flag==true) {
	    	System.out.println("Horizontal matched");
	    	return "Win";
	    }
	    
	    else if(flag2==true) {
	    	System.out.println("vertical matched");
	    	return "Win";
	    }
	    else if(leftDi.length()==mat.length) {
	    	
	    	System.out.println("left digonal matched");
	    	return "Win";
	    }
	    
	    else if(rightDi.length()==mat.length) {
	    	System.out.println("Right diagonal matched");
	    	return "Win";
	    }
		return "Lost";
		 
	 }
		
	public static void main(String[] args) {
		int[][] mat={{1,0,0,0,0}, {0,1,0,0,0}, {0,0,1,0,0}, {0,0,0,1,0}, {0,0,0,0,1}};
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
		System.out.println(check(mat));
	}
}
