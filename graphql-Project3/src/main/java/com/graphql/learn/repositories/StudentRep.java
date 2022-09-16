package com.graphql.learn.repositories;

import com.graphql.learn.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRep extends JpaRepository<Student,Integer> {
}
