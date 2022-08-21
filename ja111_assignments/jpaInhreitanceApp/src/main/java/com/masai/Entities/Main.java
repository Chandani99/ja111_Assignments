package com.masai.Entities;

import javax.persistence.EntityManager;

import com.masai.utility.GetEntityManager;

public class Main {

	public static void main(String[] args) {
		EntityManager em=GetEntityManager.provideEntityManager();
		
		Person p=new Person();
		p.setName("Radha");
		
		Employee emp=new Employee();
		emp.setName("Vandana");
	   
		emp.setHomeAddress(new Address("U.P.","Lucknow","560068"));
		emp.setOfficeAddress(new Address("u.p.","Gorakhpur","310021"));
		
		em.getTransaction().begin();
		em.persist(p);
		em.persist(emp);

		em.getTransaction().commit();
		em.close();
		
		System.out.println("Done...");
		
		
		
	}

}
