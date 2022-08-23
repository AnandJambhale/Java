package com.map;

import javax.persistence.*;
import java.util.List;

@Entity
public class QuestionsOneToMany {

    @Id
    private int QuestionId;

    private String Question;

    @OneToMany(mappedBy = "question", fetch = FetchType.EAGER)
    private List<Answer>answers;

    public QuestionsOneToMany() {
    }

    public QuestionsOneToMany(int questionId, String question, List<Answer> answers) {
        QuestionId = questionId;
        Question = question;
        this.answers = answers;
    }

    public int getQuestionId() {
        return QuestionId;
    }

    public void setQuestionId(int questionId) {
        QuestionId = questionId;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "Question{" +
                "QuestionId=" + QuestionId +
                ", Question='" + Question + '\'' +
                ", answer=" + answers +
                 '}';
    }
}
