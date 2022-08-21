package com.masai.useCases;

import java.util.Scanner;

import com.masai.AccException.InsufficientBalance;
import com.masai.AccException.InvalidAccount;
import com.masai.AccountDao.AccountDao;
import com.masai.AccountDao.AccountDaoImpl;
import com.masai.EMUtility.Account;

public class WithdrawAmount {

	public static void main(String[] args)  {
		
			AccountDao ad=new AccountDaoImpl();
			Scanner sc=new Scanner (System.in);
			
			System.out.println("Enter Account Id");
			int accId=sc.nextInt();
			
			System.out.println("Enter amount");
			int amount=sc.nextInt();
			try {
				Account acc=ad.findById(accId);
				int amount1;
				try {
					amount1 = ad.withdraw(amount, acc);
					System.out.println(amount1);
				} catch (InsufficientBalance e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			}
			catch(InvalidAccount ia){
				System.out.println("Account not found");
			}
			
		

	}

}
