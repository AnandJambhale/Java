package com.example.graphqlPractice.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Student {
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private int clas;

    @OneToOne
    private Subjects subjects;

    public Student(int id, String firstName, String lastName, int clas) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.clas = clas;
    }
}
