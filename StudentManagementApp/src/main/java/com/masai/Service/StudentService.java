package com.masai.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.Model.Student;

@Service
public interface StudentService {
	public Student addStudentData(Student student);

	public Student getStudentRecordById(Integer id);

	public Student updateRecordById(Student s, Integer id);

	public List<Student> getAllStudent();

}
