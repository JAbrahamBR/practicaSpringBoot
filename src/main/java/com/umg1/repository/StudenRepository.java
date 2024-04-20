package com.umg1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umg1.modelo.Student;

@Repository
public interface StudenRepository extends JpaRepository<Student,Long> {

}
