package org.example;

import java.util.ArrayList;

public class Trueorfalse extends Question{


    public Trueorfalse(String question, String answer) {
        super(question, answer);
    }

    @Override
    public boolean answerCheck(String answer) {
        return false;
    }
}
