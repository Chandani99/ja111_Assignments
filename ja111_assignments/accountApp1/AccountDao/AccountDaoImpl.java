package com.masai.AccountDao;

import javax.persistence.EntityManager;

import com.masai.AccException.InsufficientBalance;
import com.masai.AccException.InvalidAccount;
import com.masai.DBEntityManager.GetEntityManager;
import com.masai.EMUtility.Account;

public class AccountDaoImpl implements AccountDao{

	@Override
	public void save(Account account) {
		EntityManager em=GetEntityManager.provideEntityManager();
        
		em.getTransaction().begin();
		
		em.persist(account);
		em.getTransaction().commit();
		em.close();
		System.out.println("Done ");
	}

	@Override
	public Account findById(int id) throws InvalidAccount {
		EntityManager em=GetEntityManager.provideEntityManager();
		Account acc=em.find(Account.class, id);
		return acc;
	}

	@Override
	public void update(Account account) throws InvalidAccount {
		EntityManager em=GetEntityManager.provideEntityManager();
		em.getTransaction().begin();
		em.persist(account);
		em.getTransaction().commit();
		System.out.println("Done ");
	}

	@Override
	public void remove(Account account) throws InvalidAccount {
		EntityManager em=GetEntityManager.provideEntityManager();
		em.getTransaction().begin();
		em.remove(account);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public int withdraw(double amount, Account account) throws InsufficientBalance {
		EntityManager em=GetEntityManager.provideEntityManager();
		
		em.getTransaction().begin();
		double balance=account.getBalance();
		int remain=(int) ((int)balance-amount);
		balance-=amount;
		account.setBalance(balance);
		em.persist(account);
		em.getTransaction().commit();
		em.close();
		return remain;
	}

	@Override
	public String deposit(double amount, Account account) throws InvalidAccount {
		String msg="";
		EntityManager em=GetEntityManager.provideEntityManager();
		
		em.getTransaction().begin();
		
		account.setBalance(account.getBalance()+amount);
		em.persist(account);
		em.getTransaction().commit();
		em.close();
		msg="Done ..!";
		return msg;
	}

}
