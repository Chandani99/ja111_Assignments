package com.masai.DBUtility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBConnection {
    private static EntityManagerFactory emf;
    static {
    	emf=Persistence.createEntityManagerFactory("emp1oyee");
    }
    public static EntityManager provideEntityManager() {
    	EntityManager em= emf.createEntityManager();
    	return em;
    }
}
