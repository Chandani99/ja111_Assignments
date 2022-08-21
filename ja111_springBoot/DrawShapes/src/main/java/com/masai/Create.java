package com.masai;

public class Create {
	Shapes s;

	//setter injection
	public void setS(Shapes s) {
		this.s = s;
	}
	
	
	public void drawing() { 
		System.out.println("drawing shape ...");
		s.draw();
	}




	
	
}
