package com.graphql.learn.controllers;

import com.graphql.learn.entities.Book;
import com.graphql.learn.entities.Student;
import com.graphql.learn.entities.Subjects;
import com.graphql.learn.services.BookService;
import com.graphql.learn.services.impl.SubjectsService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.OneToOne;
import java.util.List;

@Controller
public class SubjectsController {

    @Autowired
    private SubjectsService subjectsService;

    //getAll
    @QueryMapping
    public List<Subjects> getAllSubjects(){
        return this.subjectsService.getAllSub();
    }

    //get single
    @QueryMapping
    public Subjects getSubById(@Argument int subId){
        return this.subjectsService.getSubById(subId);
    }

    //create
    @MutationMapping
    public Subjects createSubject(@Argument SubjectInp subjectInp){
        Subjects subjects=new Subjects(subjectInp.getId(),subjectInp.getName(),subjectInp.getStudent());
        return this.subjectsService.createSub(subjects);
    }
}

@Getter
@Setter
class SubjectInp{
    private int id;
    private String name;
    private Student student;
}

