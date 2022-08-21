package com.masai;

import org.springframework.stereotype.Component;


@Component(value="s")
public class Student {
    int roll;
    String name;
    int marks;
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
    
    
}
