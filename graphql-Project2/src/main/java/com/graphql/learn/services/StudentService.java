package com.graphql.learn.services;

import com.graphql.learn.entities.Student;
import com.graphql.learn.repositories.StudentRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRep studentRep;

    public StudentService(StudentRep studentRep) {
        this.studentRep = studentRep;
    }

    public Student getStuById(int id){
        return this.studentRep.findById(id).orElseThrow(()->new RuntimeException("Not found in database"));
    }

    public List<Student> getAllStudents(){
        return this.studentRep.findAll();
    }

    public Student createStudent(Student student){
        return this.studentRep.save(student);
    }
}
