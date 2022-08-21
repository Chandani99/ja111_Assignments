package studentbean;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students:");
		int n=sc.nextInt();
		
		StudentBean[] sb=new StudentBean[n];
		int sum=0;
		
		for(int i=0; i<sb.length; i++) {
			System.out.println("Enter roll number:");
			int roll=sc.nextInt();
			
			System.out.println("Enter Name:");
			String name=sc.next();
			
			System.out.println("Enter Address:");
			String address=sc.next();
			
			System.out.println("Enter Marks:");
			int marks=sc.nextInt();
			
			StudentBean sb1=new StudentBean();
			sb1.setRoll(roll);
			sb1.setName(name);
			sb1.setAddress(address);
			sb1.setMarks(marks);
			
			sb[i]=sb1;
			sum+=marks;
		}
		
		for(int j=0; j<sb.length; j++) {
			System.out.println("Roll number: " +sb[j].getRoll());
			System.out.println("Name: " +sb[j].getName());
			System.out.println("Address: " +sb[j].getAddress());
			System.out.println("Marks: " +sb[j].getMarks());
			System.out.println("***************************************************");
		}
		
		System.out.println("Avg:" +sum/sb.length);

	}

}
