package com.masai.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.entities.Emp;

public class GetAllDetails {

	public static void main(String[] args) {
	   EntityManagerFactory emf	=Persistence.createEntityManagerFactory("emp1oyee");
	   
	   EntityManager em=emf.createEntityManager();
	   
	   Emp emp=em.find(Emp.class, 10);
	   
	   if(emp !=null) {
		   System.out.println(emp);
	   }
	   else {
		   System.out.println("Record not found !");
	   }

	}

}
