package com.services;

import com.entities.Student;
import com.repositories.StudentRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService{
    @Autowired
    private StudentRep studentRep;

    public StudentService(StudentRep studentRep) {
        this.studentRep = studentRep;
    }

    public Student getStudent(int id) {
       // return this.studentRep.findById(Id).orElseThrow(()->new RuntimeException("Student you are looking is not in database"));
       return this.studentRep.getStudentById(id);
    }

    public List<Student> getAll(){
        return this.studentRep.findAll();
    }

    public Student addStudent(Student student){
        return this.studentRep.save(student);
    }
}
