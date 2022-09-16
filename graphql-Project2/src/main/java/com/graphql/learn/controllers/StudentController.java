package com.graphql.learn.controllers;

import com.graphql.learn.entities.Student;
import com.graphql.learn.repositories.StudentRep;
import com.graphql.learn.services.StudentService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @QueryMapping
    public Student getStudent(@Argument int id){
        return this.studentService.getStuById(id);
    }

    @QueryMapping
    public List<Student> getAllStudent(){
        return this.studentService.getAllStudents();
    }

    @MutationMapping
    public Student createStudent1(@Argument Student student){
         Student student1=new Student(student.getId(),student.getName());
         return this.studentService.createStudent(student1);
    }
}

@Getter
@Setter
class StudentInp{
    private int id;
    private String name;
}
