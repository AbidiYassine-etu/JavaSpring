package com.springboot.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.cls.Student;

@RestController
public class StudentController {
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Ramesh","Fadatare");
	}
	
	@GetMapping("students")
	public List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Ramesh", "Fadatare"));
		students.add(new Student("Tony", "Cena"));
		students.add(new Student("Sanjay", "Jadhav"));
		students.add(new Student("Ram", "Jadhav"));
		students.add(new Student("Umesh", "Fadatare"));
		return students;
	}
	
	@GetMapping("student/{firstName}/{lastName}/")
	public Student studentPathVariable(@PathVariable("firstName") String firstName,@PathVariable("lastName") String lastName) {
		return new Student(firstName, lastName);
	}
}
