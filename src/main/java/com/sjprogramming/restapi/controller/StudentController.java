package com.sjprogramming.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable; 

import org.springframework.web.bind.annotation.RestController;

import com.sjprogramming.restapi.entity.Student;
import com.sjprogramming.restapi.repository.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepository repo;
	//Obtener a todos los estudiantes
	//localhost:8080/students
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		List<Student> students = repo.findAll();
		 return students;	
	}
	
	//localhosto:8080/students/1
	@GetMapping("/student{id}")
	public Student getStudent(@PathVariable int id) {
		Student student = repo.findById(id).get();
		
		return student;
	}
}
