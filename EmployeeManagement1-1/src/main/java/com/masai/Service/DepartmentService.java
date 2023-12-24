package com.masai.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.Model.Department;
import com.masai.Model.Employee;

@Service
public interface DepartmentService {
	public Department addDepartment(Department dep);

	public List<Department> getAllDepartment();

	public String getDepartmentNameByEmpId(Integer eId);

	List<Employee> getEmployeebydId(Integer dId);

}
