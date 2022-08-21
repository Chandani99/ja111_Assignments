package com.masai.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.entity.Employee;

@Service
public interface EmployeeService {
	public List<Employee> viewAllEmployee();
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Integer eId, Employee employee);
	public String deleteEmployee(Integer eid);
	public List<Employee> viewAllEmployeeByDeptName(String deptNmae);
}
