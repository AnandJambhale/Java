package com.luv2code.hidernate.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "student")      //telling to watch for table named student
public class Student {

    @Id            //line 12 to 23 mapping to database columns
    @GeneratedValue(strategy = GenerationType.IDENTITY)    //this generation type helps in auto increment
    @Column(name = "id")      //telling to map this to column named id
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    public Student(){

    }

    public Student(String firstName, String lastName, String email) {      //making a constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId() {        //getters and setters
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override            //just for debugging purpose, not necessary
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
