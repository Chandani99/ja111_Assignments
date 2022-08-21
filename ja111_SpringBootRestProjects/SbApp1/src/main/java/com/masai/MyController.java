package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
//	@RequestMapping("/hello")//
//    public String sayHello() {
//		return "Hello, welcome to the spring boota RestFull api";
//	}// its a WA(in jsp form)
	
//	to make it RESTfull web Service we should return in json..for this we will have to put @ResponseBody

	@RequestMapping("/hello")//
//	@ResponseBody
    public String sayHello2() {
		return "Hello, welcome to the spring boota WS RestFull api";
	}
	
	@RequestMapping("/student") // First way===
	
//	@RequestMapping(value="/student", method=RequestMethod.GET) // Second way==
//	// @RequestMapping(value="/student", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	
//	Shortcut GetMApping (combination of Request mapping + RequestMethod)
	
	@GetMapping(value="/student",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Student> getStudent() {
		
		List<Student> stus=new ArrayList<Student>();
		stus.add(new Student(10,"Chandani",500));
		stus.add(new Student(11,"vandana",500));
		stus.add(new Student(12,"Chandan",500));
		stus.add(new Student(13,"aarti",500));
		
		return stus;
	}
// it will return raw data in form of json.
}
