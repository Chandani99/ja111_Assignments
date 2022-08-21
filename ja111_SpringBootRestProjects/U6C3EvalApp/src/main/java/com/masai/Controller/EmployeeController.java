package com.masai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.InvalidURI;
import com.masai.Exception.NullValueException;
import com.masai.Service.EmployeeService;
import com.masai.entity.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService eService;
	
	@PostMapping("/add")
	public Employee addEmployeeHandler(@RequestBody Employee emp) {
		if(emp==null) {
			throw new NullValueException("Sorry! You are providing null object to add ");
		}
		return eService.addEmployee(emp);
		
	}
	
	@PutMapping("/update/{eid}")
	public Employee updateEmployeeHandler(@PathVariable("eid") Integer eid, @RequestBody Employee emp ) {
		if(eid==null) {
			throw new InvalidURI("Soryy! you are passing Invaid URI");
		}
		return eService.updateEmployee(eid, emp);
	}
	
	@DeleteMapping("/delete/{eid}")
	public String deleteEmployeeHandler(@PathVariable("eid") Integer eid) {
		if(eid==null) {
			throw new InvalidURI("Sorry! You have passed Invalid Uri");
		}
		return eService.deleteEmployee(eid);
	}
	
	@GetMapping("/all")
	public List<Employee> viewAllEmployeeHandelr(){
		if(eService.viewAllEmployee()==null) {
			throw new NullValueException("No record found");
		}
		return eService.viewAllEmployee();
	}

	@GetMapping("{depName}")
	public List<Employee> viewAllEmployeeHandelr(@PathVariable("depName") String depName){
		if(depName==null) {
			throw new InvalidURI("Sorry! You have passed Invalid Uri");
		}
		else if(eService.viewAllEmployeeByDeptName(depName)==null) {
			throw new NullValueException("No record found");
		}
		return eService.viewAllEmployeeByDeptName(depName);
	}
}
