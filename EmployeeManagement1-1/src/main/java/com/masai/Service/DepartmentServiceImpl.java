package com.masai.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Model.Department;
import com.masai.Model.Employee;
import com.masai.Reposatory.DepartmentDao;
import com.masai.Reposatory.EmployeeDao;

@Service

public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private EmployeeDao eDao;

	@Autowired
	private DepartmentDao dDao;

	@Override
	public List<Employee> getEmployeebyDId(Integer dId) {
		List<Employee> empAll = eDao.findAll();
		List<Employee> employeeInDepartment = new ArrayList<>();
		for (Employee emp : empAll) {
			if (emp.geteId() == dId) {
				employeeInDepartment.add(emp);
			}
		}
		// TODO Auto-generated method stub
		return employeeInDepartment;

	}

//	@Override
//	public String getDepartmentNameByEmpId(Integer eId) {
//		List<Department> department = dDao.findAll();
//		for (Department d : department) {
//			List<Employee> allEmp = d.getEmp();
//			for (Employee e : allEmp) {
//				if (e.geteId() == eId) {
//					return d.getdName();
//				}
//			}
//		}
//
//		return null;
//	}

//	public String getDepartmentNameByEmpId(Integer eId) {
//		Optional<Employee> emp = eDao.findById(eId);
//		if(emp.isPresent()) {
//			Optional<Department> d = dDao.findDepartmentByEmpId(eId);
//			if(d.isPresent()) {
//				return d.get().getDName();
//			}
//		}
//		
//		return null;
//	}

	@Override
	public Department addDepartment(Department dep) {
		Department dep1 = dDao.save(dep);
		return dep1;
	}

	@Override
	public List<Department> getAllDepartment() {
		List<Department> depAll = new ArrayList<>();
		depAll = dDao.findAll();
		return depAll;
	}

	@Override
	public String getDepartmentNameByEmpId(Integer eId) {
		// TODO Auto-generated method stub
		return null;
	}

}
