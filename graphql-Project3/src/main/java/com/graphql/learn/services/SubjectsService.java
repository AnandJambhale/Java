package com.graphql.learn.services.impl;

import com.graphql.learn.entities.Book;
import com.graphql.learn.entities.Student;
import com.graphql.learn.entities.Subjects;
import com.graphql.learn.repositories.BookRep;
import com.graphql.learn.repositories.StudentRep;
import com.graphql.learn.repositories.SubjectRep;
import com.graphql.learn.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectsService {

    private SubjectRep subjectRep;

    @Autowired
    private StudentRep studentRep;

    @Autowired
    public void SubjectRep(SubjectRep subjectRep) {
        this.subjectRep = subjectRep;
    }

    public Subjects createSub(Subjects subjects) {
//        this.studentRep.save(subjects.getStudent());
        return this.subjectRep.save(subjects);
    }

    public List<Subjects> getAllSub() {
        return subjectRep.findAll();
    }

    public Subjects getSubById(int subId) {
        return this.subjectRep.findById(subId).orElseThrow(()->new RuntimeException("Book you are looking is not in database"));
    }
}
