package com.masai.Reposatory;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.masai.Model.Department;

@Repository
public interface DepartmentDao extends JpaRepository<Department, Integer>{
//	@Query("Select d from department d where :employeeId member of d.emp")
//    Optional<Department> findDepartmentByEmpId(@Param("employeeId") Integer employeeId);
}
