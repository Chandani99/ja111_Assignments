package com.masai.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.NullValueException;
import com.masai.Repository.DepartmentRepo;
import com.masai.Repository.EmployeeRepo;
import com.masai.entity.Department;
import com.masai.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
    private	EmployeeRepo eDao;
    
	@Autowired
    private DepartmentRepo depDao;

	@Override
	public List<Employee> viewAllEmployee() {

        List<Employee> allEmp=eDao.findAll();
		return allEmp;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		depDao.save(employee.getDep());
		eDao.save(employee);
		return employee;
	}

	@Override
	public Employee updateEmployee(Integer eId, Employee employee) {
		Optional<Employee> employees=eDao.findById(eId);
		if(employees==null) {
			throw new NullValueException("Employee does not exist");
		}
		employee.setEid(eId);
		eDao.save(employee);
		return employee;
	}

	@Override
	public String deleteEmployee(Integer eid) {
		Optional<Employee> employees=eDao.findById(eid);
		
		if(employees==null) {
			throw new NullValueException("Employee does not exist");
		}
		Employee emp=employees.get();
		
		Employee emp1=emp;
		eDao.delete(emp);
		return "DeletedEmployee is: "+emp1;
	}

	@Override
	public List<Employee> viewAllEmployeeByDeptName(String deptName) {
		List<Employee> allEmps=eDao.findAll();
		List<Employee> empsByDeptName=new ArrayList<>();
		for(Employee emp : allEmps) {
			Department dep=emp.getDep();
			if(dep.getDepName().equals(deptName)) {
				empsByDeptName.add(emp);
			}
		}
		return empsByDeptName;
	}

}
