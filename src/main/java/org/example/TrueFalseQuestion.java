package org.example;

public class TrueFalseQuestion extends Question{


    public TrueFalseQuestion(String question, String answer) {
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
