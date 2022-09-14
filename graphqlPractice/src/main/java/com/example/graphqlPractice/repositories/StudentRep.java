package com.example.graphqlPractice.repositories;

import com.example.graphqlPractice.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRep extends JpaRepository<Student,Integer> {
}
