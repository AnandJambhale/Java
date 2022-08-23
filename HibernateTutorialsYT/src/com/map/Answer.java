package com.map;

import javax.persistence.*;

@Entity
public class Answer {

    @Id
    private int ansId;

    private String answer;

    public Answer() {
    }

    public Answer(int ansId, String answer) {
        this.ansId = ansId;
        this.answer = answer;
    }

    public int getAnsId() {
        return ansId;
    }

    public void setAnsId(int ansId) {
        this.ansId = ansId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "ansId=" + ansId +
                ", answer='" + answer + '\'' +
                '}';
    }

    //for bidirectional
    @ManyToOne
    private QuestionsOneToMany question;

    public Answer(int ansId, String answer, QuestionsOneToMany question) {
        this.ansId = ansId;
        this.answer = answer;
        this.question = question;
    }

    public QuestionsOneToMany getQuestion() {
        return question;
    }

    public void setQuestion(QuestionsOneToMany question) {
        this.question = question;
    }
}
