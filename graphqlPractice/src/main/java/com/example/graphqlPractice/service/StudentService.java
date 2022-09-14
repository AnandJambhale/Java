package com.example.graphqlPractice.service;

import com.example.graphqlPractice.entities.Student;
import com.example.graphqlPractice.repositories.StudentRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRep studentRep;

    @Autowired
    public StudentService(StudentRep studentRep){
        this.studentRep=studentRep;
    }

    public Student createStu(Student student){
        return this.studentRep.save(student);
    }

    public List<Student> getAll(){
        return this.studentRep.findAll();
    }

    public Student getById(int id){
        return this.studentRep.findById(id).orElseThrow(()->new RuntimeException("not in database"));
    }

    public String fullName(String firstName, String lastName){
        return firstName+" "+lastName;
    }

    public Student getStu(int id){
        return this.studentRep.findById(id).orElseThrow(()->new RuntimeException("not in database"));
    }

}
