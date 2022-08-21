package com.masai.useCases;

import java.util.Scanner;

import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;

public class AddressOfEmployee {

	public static void main(String[] args) {
		EmployeeDao ed=new EmployeeDaoImpl();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enetr Employee Id");
		int id=sc.nextInt();
		String address=ed.getAddressOfEmployee(id);
		if(address=="") {
			System.out.println("Employee does not exists.");
		}
		else {
			System.out.println("The address of Employee is: " +address);
		}

	}

}
