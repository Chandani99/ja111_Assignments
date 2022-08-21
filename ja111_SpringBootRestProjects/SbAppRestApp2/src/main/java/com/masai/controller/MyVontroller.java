package com.masai.controller;

import java.net.http.HttpHeaders;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.boot.model.naming.IllegalIdentifierException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entity.Student;

@RestController
public class MyVontroller {

	@GetMapping("/msg")
	public String displey() {
		return ("hello student");
	}
	
//	ResponseEntity example...
	@GetMapping("/hello")
	public ResponseEntity<String> sayHello() {
		
		
		
		
		org.springframework.http.HttpHeaders hh=new org.springframework.http.HttpHeaders();
		hh.add("jwt", "sjhsgfgueef");
		hh.add("user", "user");
		hh.add("hello", "abc");
		ResponseEntity<String> re=new ResponseEntity<String>("Welcome",hh,HttpStatus.ACCEPTED);
		return re;
	}
	
	
//	getting only one student details we will use pathVariable
	@GetMapping("/students/{roll}")
	public Student getStudentDetailHandler(@PathVariable("roll") Integer roll) {
		
		Student stu=new Student(roll,"Ram",500);
		
		return stu;
	}
	
	@GetMapping("/student/{roll}")
	public Student getStudentDetailHandler1(@PathVariable("roll") Integer roll) {
		if(roll<100) {
			throw new IllegalArgumentException("roll no should be >100");
		}
		else {
		Student stu=new Student(roll,"Ram",500);
		
		return stu;
		}
	}
	
//	defining the exception handler method to handle exception
	
//	@ExceptionHandler(IllegalArgumentException.class)
//	
//    public ResponseEntity<String> myExceptionHandler(IllegalArgumentException ia) {
//        System.out.println("Inside handler method..");
//		
//		return new ResponseEntity<String>(ia.getMessage(),HttpStatus.BAD_REQUEST);
//	
//	}
	
//	Request parameter Example
	
//	@GetMapping("/setstudent")
//	public Student getStudentDetailHandlerParam(@RequestParam Integer r) {
//		
//		Student stu=new Student(r,"Ram",500);
//		return stu;
//	}
	
	
//	Multiple request param
	
	@GetMapping("/getstudent")
	public Student getStudentDetailHandlerParam(@RequestParam Integer r,
												@RequestParam String name,
												@RequestParam Integer marks) {
		
		Student stu=new Student(r,name,marks);
		return stu;
	}
	
//	write http://localhost:8080/getstudent?r=10&name=ravi&marks=900
	
	@GetMapping("/students")
	public List<Student> getStudentAllDetailHandler() {
//		List<Student> stu=new ArrayList<>();
		return Arrays.asList(
				new Student(10,"shyam",500),
				new Student(11,"Raju",500),
				new Student(13,"chandu",500),
				new Student(14,"vandu",500));
		 
	}
	
	
	
//	Sending request using "POST" method example(it will not work on browser, so we need "postman" or some other client to send post request)=====================
	
	
	@PostMapping(value="/students",consumes=MediaType.APPLICATION_JSON_VALUE)
	public String saveStudentDetailHandler(@RequestBody Student stu) {
		
		return "Student stored ," +stu;
	}
	
	
//	Sending request using "PUT" method example==========
	
//	http://localhost:8080/students/10
	
	@PutMapping(value="/students/{roll}")
	public Student updateStudentDetailHandler(@RequestBody Student stu, @PathVariable ("roll") Integer roll) {
		stu.setMarks(stu.getMarks()+300);
		return stu;
	}
	

	
}
