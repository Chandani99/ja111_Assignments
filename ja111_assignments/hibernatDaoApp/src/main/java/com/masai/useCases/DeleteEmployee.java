package com.masai.useCases;

import java.util.Scanner;

import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;

public class DeleteEmployee {

	public static void main(String[] args) {
		EmployeeDao ed=new EmployeeDaoImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id to delete ");
		int eid=sc.nextInt();
		
		
		boolean ans=ed.deleteEmployee(eid);
		if(ans) {
			System.out.println("Employee deleted ");
		}
		else {
			System.out.println("Employee does not exist ");
		}
	}

}
