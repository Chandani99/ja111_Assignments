package com.masai.DBEntityManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetEntityManager {
	 private static EntityManagerFactory emf;
	    static {
	    	emf=Persistence.createEntityManagerFactory("accountUnit");
	    }
	    public static EntityManager provideEntityManager() {
	    	EntityManager em= emf.createEntityManager();
	    	return em;
	    }
}
