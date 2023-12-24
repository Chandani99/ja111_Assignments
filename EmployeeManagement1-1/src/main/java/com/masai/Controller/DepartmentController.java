package com.masai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Model.Department;
import com.masai.Model.Employee;
import com.masai.Service.DepartmentService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private DepartmentService dService;

	@PostMapping("/addDepartment")
	public ResponseEntity<Department> addDepartmentHandler(@RequestBody Department dep) {
		return new ResponseEntity<>(dService.addDepartment(dep), HttpStatus.ACCEPTED);

	}

	@GetMapping("getEmployees/{dId}")
	public ResponseEntity<List<Employee>> getEmployeeByDId(@PathVariable("dId") Integer dId) {

		return new ResponseEntity<List<Employee>>(dService.getEmployeebydId(dId), HttpStatus.OK);
	}

}
