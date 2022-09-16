package com.trial;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subjects {
    @Id
    private int id;
    private String name;

    public Subjects() {
    }

    public Subjects(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Subjects{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
