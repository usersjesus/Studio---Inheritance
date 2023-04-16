package org.example;

public class CheckboxQuestion extends Question {


    public CheckboxQuestion(String question, String answer) {
        super(question, answer);
    }

    @Override
    public boolean answerCheck(String answer) {
        String actualAnswer = this.getAnswer();
        if (answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}
