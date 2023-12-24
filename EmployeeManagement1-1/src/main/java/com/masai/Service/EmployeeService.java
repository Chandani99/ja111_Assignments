package com.masai.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.Model.Employee;

@Service
public interface EmployeeService {
	public Employee addEmployee(Employee emp);

	public Employee addEmployeeByDepartmentId(Employee emp, Integer dId);

	public Employee getEmployeeById(Integer eId);

	public List<Employee> getEmployeeByDId(Integer dId);

	public List<Employee> getAllEmployee();

	default String updateEmployeeDetailById(Employee emp) {
		return null;
	}

}
