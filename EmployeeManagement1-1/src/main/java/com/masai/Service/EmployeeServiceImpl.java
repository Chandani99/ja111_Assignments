package com.masai.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Model.Department;
import com.masai.Model.Employee;
import com.masai.Reposatory.DepartmentDao;
import com.masai.Reposatory.EmployeeDao;

@Service

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao eDao;
	@Autowired
	private DepartmentDao dDao;

	@Override
	public Employee getEmployeeById(Integer eId) {
		Optional<Employee> employee = eDao.findById(eId);
		return employee.get();
	}

	@Override
	public List<Employee> getEmployeeByDId(Integer dId) {
		List<Employee> employeeInDepartment = new ArrayList<>();
		List<Employee> empAll = eDao.findAll();
		for (Employee emp : empAll) {
			if (emp.getDep().getdId() == dId) {
				employeeInDepartment.add(emp);
			}
		}

		// TODO Auto-generated method stub
		return employeeInDepartment;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> empAll = eDao.findAll();
		return empAll;
	}

//	@Override
//	public String updateEmployeeDetailById(Employee emp) {
////		eDao.save(emp);
//		return null;
//	}

	@Override
	public Employee addEmployee(Employee emp) {
		dDao.save(emp.getDep());
		Employee emp1 = eDao.save(emp);

		return emp1;
	}

	@Override
	public Employee addEmployeeByDepartmentId(Employee emp, Integer dId) {
		Optional<Department> dep = dDao.findById(dId);
		emp.setDep(dep.get());

		return eDao.save(emp);
	}

}
