package com.Controllers;

import com.entities.Student;
import com.services.StudentService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @QueryMapping("getStu")
    public Student getStu(int stuId){
        return this.studentService.getStudent(stuId);
    }

    @QueryMapping("getAllStudent")
    public List<Student> getAllStudent(){
        return studentService.getAll();
    }

    @MutationMapping
    public Student createStudent(Student student){
        return this.studentService.addStudent(student);
    }
}

@Getter
@Setter
class StudentInp{
    private int id;
    private String name;
}
