package com.masai.Assignment4.Question1;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
	String myNumber;
    List<Contact> phoneNo=new ArrayList<Contact>();
    
	public MobilePhone(String myNumber) {
		super();
		this.myNumber = myNumber;
		this.phoneNo=phoneNo;
	}
    
	public  boolean addNewContact(Contact contact) {
		for(Contact con: phoneNo) {
			if(con.getName().equals(contact.getName()) && con.getPhoneNo().equals(contact.getPhoneNo())) {
				return false;
			}
			
		}
		phoneNo.add(contact);
		return true;
	
	}
	
	public  boolean updateContact(Contact contact) {
		for(Contact con: phoneNo) {
			if(con.getName().equals(contact.getName())) {
//				con.setName(contact.getName());
				con.setPhoneNo(contact.getPhoneNo());
				return true;
			}
			
		}
		return false;
	}
	
	public  boolean removeContact(Contact contact) {
		if(phoneNo.remove(findContact( contact)) != null) {
			
			return true;
		}
		return false;
		
	}
	public int findContact(Contact contact) {
		for(int i=0; i<phoneNo.size(); i++) {
			Contact con=phoneNo.get(i);
			if(con.getName().equals(contact.getName()) && con.getPhoneNo().equals(contact.getPhoneNo())) {
				
				return i;
			}
			
		}
		return -1;
	}
	public boolean findContact(String name) {
		for(int i=0; i<phoneNo.size(); i++) {
			Contact con=phoneNo.get(i);
			if(con.getName().equals(name)) {
				
				return true;
			}
			
		}
		return false;
	}
	public Contact queryContact(String name) {
		for(int i=0; i<phoneNo.size(); i++) {
			Contact con=phoneNo.get(i);
			if(con.getName().equals(name)) {
				
				return con;
			}
			
		}
		return null;
	}
	public void printContacts() {
		for(int i=0; i<phoneNo.size(); i++) {
			Contact con=phoneNo.get(i);
			System.out.println(con.getName()+"->"+con.getPhoneNo());
		}
	}
}
