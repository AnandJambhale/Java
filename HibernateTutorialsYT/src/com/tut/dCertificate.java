package com.tut;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable   //to join this table with student
public class dCertificate {

    private String course;

    private String duration;

    public dCertificate(String course, String duration) {
        this.course = course;
        this.duration = duration;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public dCertificate() {
    }

    @Override
    public String toString() {
        return "dCertificate{" +
                "course='" + course + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
