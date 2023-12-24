package com.masai.Reposatory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
