package com.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "subjects")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Subjects {
    @Id
    private int id;

    private String subName;

//    @ManyToMany
//    private List<Student> student;
}
