package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions = new ArrayList<>();

    private int numberOfQuestionsCorrects = 0;

    private Scanner userAnswer = new Scanner(System.in);

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public void runQuiz() {
        for (Question question : questions) {
            System.out.println(question.getQuestion());
            String userAnswer = this.getAnswer();
            boolean userGotQuestionCorrect = question.answerCheck(userAnswer);
        }
    }
    private String getAnswer() {
        String userAnswer = scanner.nextLine();
        return userAnswer;
    }
}
