package com.luv2code.hidernate.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class QAnswer {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "answer")
    private String Answer;

    public QAnswer() {
    }

    public QAnswer(String answer) {
        Answer = answer;
    }

    @Override
    public String toString() {
        return "QAnswer{" +
                "id=" + id +
                ", Answer='" + Answer + '\'' +
                '}';
    }
}
