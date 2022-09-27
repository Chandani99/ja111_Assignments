package com.masai.Assignment4.Question1;

public class Contact {
	
    @Override
	public String toString() {
		return "Contact [name=" + name + ", phoneNo=" + phoneNo + "]";
	}

	private String name;
    private String phoneNo;
    
	public Contact(String name, String phoneNo) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
    
	public static Contact createContact(String name, String phoneNo) {
		return new Contact(name, phoneNo);
		
	}
	
	
}
