package com.luv2code.hidernate.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "instructor_detail")
public class instructorDetail {
    //annotate the class as an entity and map to db table

    //define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  int id;

    @Column(name = "youtube_channel")
    private String youtubeChannel;

    @Column(name = "hobby")
    private String hobby;


    //add new field for instructor(also add getter and setter)
    @OneToOne(mappedBy = "InstructorDetail", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private  instructor Instructor;

    public instructor getInstructor() {
        return Instructor;
    }

    public void setInstructor(instructor instructor) {
        Instructor = instructor;
    }

    //annotate fields with db columns names

    //create constructor
    public instructorDetail() {
    }

    public instructorDetail(String youtubeChannel, String hobby) {
        this.youtubeChannel = youtubeChannel;
        this.hobby = hobby;
    }


    //generate getter/setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getYoutubeChannel() {
        return youtubeChannel;
    }

    public void setYoutubeChannel(String youtubeChannel) {
        this.youtubeChannel = youtubeChannel;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }


    //generate toString()

    @Override
    public String toString() {
        return "instructorDetail{" +
                "id=" + id +
                ", youtubeChannel='" + youtubeChannel + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
