package com.masai.useCases;

import java.util.Scanner;

import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;

public class NameAndAddressOfEmployee {

	public static void main(String[] args) {
		EmployeeDao ed=new EmployeeDaoImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id to delete ");
		int eid=sc.nextInt();
		
		String na[]=ed.getNameAndAddress(eid);
		if(na==null) {
			System.out.println("Employee does not exists");
		}
		else {
				System.out.println("Name: "+na[0]);
				System.out.println("Address: "+na[1]);
		}

	}

}
