package com.book.demo.dao;

import com.book.demo.Entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository {
    public Student findById(int id);
}
