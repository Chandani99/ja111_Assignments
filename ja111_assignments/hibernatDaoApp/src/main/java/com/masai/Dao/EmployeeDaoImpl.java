package com.masai.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.DBUtility.DBConnection;
import com.masai.Entity.Emp;


public class EmployeeDaoImpl implements EmployeeDao{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Emp> getAllEmployee() {
		 
		EntityManager em=DBConnection.provideEntityManager();
		
		Query query=em.createQuery("Select e from Emp e");
		
		List <Emp> emp=(List<Emp>)query.getResultList();
		
		return emp;
		
	}

	@Override
	public String getAddressOfEmployee(int empId) {
		String address="";
		EntityManager em=DBConnection.provideEntityManager();
		Emp fEmp=em.find(Emp.class, empId);
		if(fEmp==null) {
			address="";
		}
		else {
		     address=fEmp.getAddress();
		}
		// TODO Auto-generated method stub
		return address;
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		String print="";
		EntityManager em=DBConnection.provideEntityManager();
		Emp fEmp=em.find(Emp.class, empId);
		if(fEmp==null) {
			print="Employee does not exists";
		}else {
			em.getTransaction().begin();
			fEmp.setSalary(fEmp.getSalary()+bonus);
			em.getTransaction().commit();
			
			print="Done..!";
		}
		
		// TODO Auto-generated method stub
		return print;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		boolean massage= false;
		EntityManager em=DBConnection.provideEntityManager();
		Emp fEmp=em.find(Emp.class, empId);
		if(fEmp==null) {
			massage=false;
		}else {
			em.getTransaction().begin();
			em.remove(fEmp);
			em.getTransaction().commit();
			
			massage=true;
		}
		// TODO Auto-generated method stub
		return massage;
	}

	@Override
	public String[] getNameAndAddress(int empId) {
		String [] namsAndAddress= new String[2];
		EntityManager em=DBConnection.provideEntityManager();
		Emp fEmp=em.find(Emp.class, empId);
		if(fEmp==null) {
			return null;
		}
		else {
			namsAndAddress[0]=fEmp.getName();
			namsAndAddress[1]=fEmp.getAddress();
		}
		return namsAndAddress;
	}

}
