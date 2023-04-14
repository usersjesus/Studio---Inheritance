package org.example;

import java.util.ArrayList;

public class Checkbox extends Question {


    public Checkbox(String question, String answer) {
        super(question, answer);
    }

    @Override
    public boolean answerCheck(String answer) {
        return false;
    }
}
