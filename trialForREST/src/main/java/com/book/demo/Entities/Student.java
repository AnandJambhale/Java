package com.book.demo.Entities;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private int Studuing_in;

    public Student() {
    }

    public Student(int id, String name, int studuing_in) {
        this.id = id;
        this.name = name;
        Studuing_in = studuing_in;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStuduing_in() {
        return Studuing_in;
    }

    public void setStuduing_in(int studuing_in) {
        Studuing_in = studuing_in;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Studuing_in=" + Studuing_in +
                '}';
    }
}
