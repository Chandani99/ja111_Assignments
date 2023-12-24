package com.masai.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Model.Student;
import com.masai.Reposatory.StudentDao;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao sDao;

	@Override
	public Student addStudentData(Student student) {
		if (student == null) {
			return null;
		}
		// TODO Auto-generated method stub
		return sDao.save(student);
	}

	@Override
	public Student getStudentRecordById(Integer id) {
		Optional<Student> s = sDao.findById(id);
		return s.get();
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> allStudent = sDao.findAll();
		return allStudent;
	}

	@Override
	public Student updateRecordById(Student s, Integer id) {
		Optional<Student> studentOpt = sDao.findById(id);
		if (studentOpt.isPresent()) {
			Student student = studentOpt.get();
			student.setsName(s.getsName());
			student.setCourse(s.getCourse());
			student.setsId(id);
			return sDao.save(student);
		}
		return null;
	}

}
