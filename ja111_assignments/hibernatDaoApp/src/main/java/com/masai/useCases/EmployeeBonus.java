package com.masai.useCases;

import java.util.Scanner;

import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;

public class EmployeeBonus {

	public static void main(String[] args) {
		EmployeeDao ed=new EmployeeDaoImpl();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee Id ");
		int eid=sc.nextInt();
		System.out.println("Enter bonus amount");
		int amount=sc.nextInt();
        
		String msg=ed.giveBonusToEmployee(eid, amount);
		
		System.out.println(msg);
		
	}

}
