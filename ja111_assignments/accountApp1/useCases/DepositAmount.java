package com.masai.useCases;

import java.util.Scanner;

import com.masai.AccException.InvalidAccount;
import com.masai.AccountDao.AccountDao;
import com.masai.AccountDao.AccountDaoImpl;
import com.masai.EMUtility.Account;

public class DepositAmount {

	public static void main(String[] args) {
		AccountDao ad=new AccountDaoImpl();
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter Account Id");
		int accId=sc.nextInt();
		
		System.out.println("Enter amount");
		int amount=sc.nextInt();
		try {
			Account acc=ad.findById(accId);
			String msg =ad.deposit(amount, acc);
			System.out.println(msg);
			
			
	    }
		catch(InvalidAccount ia) {
			ia.getMessage();
		}
	}

}
