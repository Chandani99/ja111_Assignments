package com.masai;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Model.Student;
import com.masai.Service.StudentService;

@RestController
@RequestMapping("students")
public class StudentController {
	@Autowired
	private StudentService sService;

	@PostMapping("/addStudent/")
	public ResponseEntity<Student> addStudentDataHandler(@RequestBody Student stu) {

		return new ResponseEntity<>(sService.addStudentData(stu), HttpStatus.ACCEPTED);
	}

	@GetMapping("/getStudent/{id}")
	public ResponseEntity<Student> addStudentDataHandler(@PathVariable("id") Integer id) {

		return new ResponseEntity<>(sService.getStudentRecordById(id), HttpStatus.ACCEPTED);
	}

	@GetMapping("/GetAllStudent/")
	public ResponseEntity<List<Student>> addStudentDataHandler() {

		return new ResponseEntity<>(sService.getAllStudent(), HttpStatus.ACCEPTED);
	}

	@PutMapping("/updateStudent/{id}")
	public ResponseEntity<Student> updateRecordHandler(@RequestBody Student s, @PathVariable("id") Integer id) {
		return new ResponseEntity<Student>(sService.updateRecordById(s, id), HttpStatus.OK);
	}

}
