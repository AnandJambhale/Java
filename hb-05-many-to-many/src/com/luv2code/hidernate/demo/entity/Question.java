package com.luv2code.hidernate.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "Question")
public class Question {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "Question")
    private String question;

    @OneToOne
    @JoinColumn(name = "answer_id")
    private QAnswer qAnswer;

    public Question() {
    }

    public Question(String question, QAnswer qAnswer) {
        this.question = question;
        this.qAnswer = qAnswer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public QAnswer getqAnswer() {
        return qAnswer;
    }

    public void setqAnswer(QAnswer qAnswer) {
        this.qAnswer = qAnswer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", qAnswer=" + qAnswer +
                '}';
    }
}
