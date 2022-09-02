package com.book.demo.controllers;

import com.book.demo.Entities.Student;
import com.book.demo.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MyController {

    @Autowired
    public StudentService studentService;

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getStudents(){
        List<Student>list=studentService.getStudents();
        if (list.size()==0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/student/{studentId}")
    public ResponseEntity<Student> getStudentById(@PathVariable("studentId") int id){
        Student  student=this.studentService.getStudentById(id);
        if (student==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(student));
    }

    @PostMapping("/book")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        Student stu=null;
        try {
            stu=studentService.addStudent(student);
            return ResponseEntity.of(Optional.of(stu));
        }
        catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DeleteMapping("student/{studentId}")
    public ResponseEntity<Void> deleteStudent(@PathVariable("studentId")int id){
        try {
            this.studentService.deleteStudent(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
