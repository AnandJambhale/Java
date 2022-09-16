package com.graphql.learn.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

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

//    @OneToOne
//    private Subjects subjects;
}
