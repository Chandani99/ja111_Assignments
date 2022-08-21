package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext acx = new ClassPathXmlApplicationContext("applicationContext.xml");
		A a1=acx.getBean(A.class,"a");
		a1.displayMsg();

	}

}
