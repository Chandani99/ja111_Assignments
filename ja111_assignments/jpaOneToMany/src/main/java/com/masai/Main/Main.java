package com.masai.Main;

import javax.persistence.EntityManager;

import com.masai.Entities.Department;
import com.masai.Entities.Employee;
import com.masai.Utility.DeptEntityManager;

public class Main {

	public static void main(String[] args) {
		EntityManager em=DeptEntityManager.provideEntityManager();
		
		Department dept1= new Department();
		dept1.setDname("Computer");
		dept1.setLocation("Gorakhpur");
		
		Employee employee=new Employee();
		employee.setEname("Ram");
		employee.setAddress("Delhi");
		employee.setSalary(67900);
		employee.setDept(dept1);
		
		Employee employee1=new Employee();
		employee1.setEname("Raju");
		employee1.setAddress("Delhi");
		employee1.setSalary(100000);
		employee1.setDept(dept1);
		
		Employee employee3=new Employee();
		employee3.setEname("Ranco");
		employee3.setAddress("Lucknow");
		employee3.setSalary(90000);
		employee3.setDept(dept1);
		
		
		dept1.getEmp().add(employee);
		dept1.getEmp().add(employee1);
		
		em.getTransaction().begin();
//		em.persist(employee);
//		em.persist(employee1);
		em.persist(dept1);
		
		em.getTransaction().commit();
		em.close();
		System.out.println("done");
		
		
		

	}

}
