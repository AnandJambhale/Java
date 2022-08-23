package com.luv2code.hidernate.demo.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "course")
public class Course {
    //define our fields

    //define instructors

    //define getter and setters

    //define toSring

    //annotate fields

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;


    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "instructor_id")
    private Instructor Instructor;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id")
    private List<Review>reviews;

    public Course(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Instructor getInstructor() {
        return Instructor;
    }

    public void setInstructor(Instructor instructor) {
        Instructor = instructor;
    }

    public Course(String title) {
        this.title = title;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    //add a convenience method
    public void addReview(Review theReview){
        if (reviews==null){
            reviews=new ArrayList<>();
        }
        reviews.add(theReview);
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
