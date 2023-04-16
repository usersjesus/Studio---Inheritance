package org.example;

import java.util.ArrayList;

public abstract class Question {
    private String question;
    private String answer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

//    public void setQuestion(String question) {
//        this.question = question;
//    }

    public String getAnswer() {
        return answer;
    }

//    public void setAnswer(String answer) {
//        this.answer = answer;
//    }

    public abstract boolean answerCheck (String answer);
}
