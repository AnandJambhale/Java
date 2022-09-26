package com.graphql.learn.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {

    @Id
    private int id;
    private String name;

    @OneToOne
    private Subjects subjects;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
