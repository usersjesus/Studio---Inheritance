package org.example;

import java.util.ArrayList;

public class multipleChoice extends Question {


    public multipleChoice(String question, String answer) {
        super(question, answer);
    }

    @Override
    public boolean answerCheck(String answer) {
        if (answer.equals(this.getAnswer())) {
            return true;
        } else {
            return false;
        }
    }


}
