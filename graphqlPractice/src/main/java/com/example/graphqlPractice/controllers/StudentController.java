package com.example.graphqlPractice.controllers;

import com.example.graphqlPractice.entities.Student;
import com.example.graphqlPractice.sample.SampleRequest;
import com.example.graphqlPractice.service.StudentService;
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

    @QueryMapping("getStudent")
    public Student getById(@Argument int stuId){
        return studentService.getById(stuId);
    }

    @QueryMapping      //by default it will take method name
    public List<Student> getAll(){
        return studentService.getAll();
    }

    @MutationMapping("createStu")
    public Student addStu(@Argument Student student){
        Student stu=new Student(student.getId(),student.getFirstName(),student.getLastName(),student.getClas());
        return studentService.createStu(stu);
    }

    //trails
    @QueryMapping
    public String full(@Argument String firstName, @Argument String lastName){
        return studentService.fullName(firstName,lastName);
    }
    @QueryMapping
    public String fullName(@Argument SampleRequest sampleRequest){
        return sampleRequest.getFirstName()+" "+sampleRequest.getLastName()+" "+sampleRequest.getName();
    }

    @QueryMapping
    public Student getStu(@Argument int id){
        return studentService.getStu(id);
    }
}

@Getter
@Setter
class StudentInp {
    int id;
    String firstName;
    String lastName;
    int clas;
}
