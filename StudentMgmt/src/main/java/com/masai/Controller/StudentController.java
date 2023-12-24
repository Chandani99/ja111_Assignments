package com.masai.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Entity.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	private final Map<Integer, Student> studentMap = new HashMap<>();

	@PostMapping("/")
	public ResponseEntity<String> addStudentInfoHandler(@RequestBody Student student) {
		studentMap.put(student.getId(), student);
//		Logger msg = Logger.getLogger(StudentController.class.getName());
		return new ResponseEntity<String>("Student Added " + student.getName(), HttpStatus.ACCEPTED);
	}

}
