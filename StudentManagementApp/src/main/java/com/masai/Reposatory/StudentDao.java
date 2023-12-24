package com.masai.Reposatory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Model.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

}
