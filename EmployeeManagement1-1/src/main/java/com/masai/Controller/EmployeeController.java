package com.masai.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Model.Employee;
import com.masai.Service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService eService;

	@PostMapping("/addEmployee")
	public ResponseEntity<Employee> addEmployeeHandler(@RequestBody Employee emp) {
		return new ResponseEntity<>(eService.addEmployee(emp), HttpStatus.ACCEPTED);
	}
//	@PostMapping("/addEmployee")
//	public ResponseEntity<Employee> addEmployeeHandler(@RequestBody Employee emp){
//		return new ResponseEntity<>(eService.addEmployee(emp),HttpStatus.ACCEPTED);
//	}
//	@PostMapping("/addEmployee")
//	public ResponseEntity<Employee> addEmployeeHandler(@RequestBody Employee emp){
//		return new ResponseEntity<>(eService.addEmployee(emp),HttpStatus.ACCEPTED);
//	}
}
