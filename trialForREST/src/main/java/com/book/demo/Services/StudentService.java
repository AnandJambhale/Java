package com.book.demo.Services;

import com.book.demo.Entities.Student;
import com.book.demo.dao.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentService {

    @Autowired
    public StudentRepository studentRepository;

    public List<Student> getStudents(){
        List<Student>list=(List<Student>) this.studentRepository.findAll();
        return list;
    }

    public Student getStudentById(int id){
        Student student=null;
        try {
            student=this.studentRepository.findById(id);
        }
        catch (Exception e){
            System.out.println(e);
        }
        return student;
    }

    public Student addStudent(Student student){
        Student result=(Student) studentRepository.save(student);
        return result;
    }

    public void deleteStudent(int sid){
        studentRepository.deleteById(sid);
    }
}
