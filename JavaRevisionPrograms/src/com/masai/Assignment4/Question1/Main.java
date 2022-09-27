package com.masai.Assignment4.Question1;

public class Main {

	public static void main(String[] args) {
		MobilePhone mbp=new MobilePhone("7982123599");
		System.out.println(mbp.addNewContact(Contact.createContact("Chandani", "7982123599")));
		System.out.println(mbp.addNewContact(Contact.createContact("Vandana", "7982123599")));
		System.out.println(mbp.updateContact(Contact.createContact("Vandana", "9696648405")));
		System.out.println(mbp.addNewContact(Contact.createContact("Ashu", "9835647680")));
		System.out.println(mbp.removeContact(Contact.createContact("Ashu", "9835647680")));
		mbp.printContacts();
		System.out.println(mbp.addNewContact(Contact.createContact("Ashu", "9835647680")));
		System.out.println(mbp.findContact(Contact.createContact("Ashu", "9835647680")));
		System.out.println(mbp.findContact("Ashu"));
		System.out.println(mbp.queryContact("Ashu"));
		
		mbp.printContacts();
      
	}

}
