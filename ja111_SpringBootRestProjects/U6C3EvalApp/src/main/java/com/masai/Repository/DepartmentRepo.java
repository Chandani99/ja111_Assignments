package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer>{

}
