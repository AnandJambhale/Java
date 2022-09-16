package com.graphql.learn.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {

    @Id
    private int id;
    private String title;
    private String description;
    private String author;
    private int price;
    private int pages;

    @OneToOne
    private Student student;
}
