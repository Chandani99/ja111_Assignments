package com.masai;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component(value="d")
public class Dependencies {
	List<String> cities;
    List<Student> students;
    Map<Student, String> theMap;
}
