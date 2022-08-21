package com.masai.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.masai.demo.Travell;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext acx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Travell t=acx.getBean(Travell.class, "t");
		t.journey();
		
     
	}

}
