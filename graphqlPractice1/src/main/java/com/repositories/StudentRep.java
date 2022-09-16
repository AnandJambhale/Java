package com.repositories;

import com.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRep extends JpaRepository<Student,Integer> {
    Student getStudentById(int id);
}
