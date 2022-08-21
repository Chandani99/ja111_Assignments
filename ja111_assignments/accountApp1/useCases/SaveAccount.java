package com.masai.useCases;

import java.util.Scanner;

import com.masai.AccountDao.AccountDao;
import com.masai.AccountDao.AccountDaoImpl;
import com.masai.EMUtility.Account;

public class SaveAccount {

	public static void main(String[] args) {
		AccountDao ad=new AccountDaoImpl();
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter Account Id");
		int accId=sc.nextInt();
		
		System.out.println("Enter email");
		String email=sc.next();
		
		System.out.println("Enter address");
		String address=sc.next();
		
		System.out.println("Enter balance");
		double balance=sc.nextDouble();
		
		Account ac=new Account(accId, email, address, balance);
		
//		Account ac=new Account(10, "abc@gmail.com", "Delhi", 299000);
		ad.save(ac);
	}

}
