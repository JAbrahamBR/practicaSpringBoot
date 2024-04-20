package com.umg1.servicio;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.umg1.modelo.Student;
import com.umg1.repository.StudenRepository;

public class StudentService {
	
	StudenRepository studentRepository;
	
	public ResponseEntity<List<Student>> getAllStudents(){
		return new ResponseEntity<>(studentRepository.findById(id);
		if(student.isPresent));
		
	}



}
