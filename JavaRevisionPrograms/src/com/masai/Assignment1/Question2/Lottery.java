package com.masai.Assignment1.Question2;
import java.util.*;
public class Lottery {
    
	public static void winingAnount(int num) {
		Random rn = new Random();
		int range = 1000 - 100;
		int randomNum =  rn.nextInt(range) + 100;
		System.out.println(randomNum);
		if(num==randomNum) {
			System.out.println("Congratulation! you won the lottery. The winning prize is: $ 10,000");
		}
		else {
			String s1="";
			s1+=num;
			String s2="";
			s2+=randomNum;
			int count=0;
			for(int i=0; i<s1.length(); i++) {
				int flag=0;
				for(int j=0; j<s2.length();j++) {
					if(s1.charAt(i)==s2.charAt(j)) {
						flag=1;
					}
				}
				if(flag==1) {
					count++;
				}
				
			}
			if(count==3) {
				System.out.println("Congratulation! you won prize is: $ 3,000");

			}
			else if(count==1||count==2) {
				System.out.println("Congratulation! you won prize is: $ 1,000");

			}
			else {
				System.out.println("Better luck next time !");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//
//		Random rn = new Random();
//		int range = 1000 - 100;
//		int randomNum =  rn.nextInt(range) + 100;
//		System.out.println(randomNum);
		System.out.println("Enter three digits lottery number");
		System.out.println("=======================================");
		int num=sc.nextInt();
		
		winingAnount(num);

	}

}
