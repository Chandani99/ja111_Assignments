package com.masai.Utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DeptEntityManager {
      private static EntityManagerFactory emf;
      static {
    	  emf=Persistence.createEntityManagerFactory("emp1oyeeUnit");
      }
      
      public static EntityManager provideEntityManager() {
      	EntityManager em= emf.createEntityManager();
      	return em;
      }
}
