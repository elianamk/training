package net.eliana;

import java.util.Objects;
import java.util.Scanner;

public class trivia2 {
    public static void main(String[] args) {

        String[] questions = new String[5];
        questions[0] = "What is Halsey's age?";
        questions[1] = "How many albums does Halsey have?";
        questions[2] = "How many siblings does Halsey have?";
        questions[3] = "What is Halsey's real name?";
        questions[4] = "What album did Halsey release in 2015?";

        String[] answers = new String[5];
        answers[0] = "27";
        answers[1] = "4";
        answers[2] = "2";
        answers[3] = "Ashley";
        answers[4] = "Badlands";

        int yourScore = 0;

        outputQuestionsAndAnswers(questions, answers);

        if(Objects.equals(answers[0], "27")) {
            yourScore++;
        }
        if(Objects.equals(answers[1], "4")) {
            yourScore++;
        }

        if(Objects.equals(answers[2], "2")) {
            yourScore++;
        }

        if(Objects.equals(answers[3], "Ashley")) {
            yourScore++;
        }

        if(Objects.equals(answers[4], "Badlands")) {
            yourScore++;
        }

        outputScore(yourScore);

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Do you love Halsey?");
            if(scanner.next().equals("Yes")) {
                continue;
            } else {
                break;
            }
        }
    }

    public static void outputQuestionsAndAnswers(String[] questions, String[] answers) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            answers[i] = scanner.next();
        }
    }

    public static void outputScore(int yourScore) {
        switch (yourScore) {
            case 1, 2, 3, 4 -> System.out.println("You passed the trivia " + true + " with " + yourScore + " points!");
            case 5 -> System.out.println("You nailed the trivia " + true + " with " + yourScore + " points!");
            default -> System.out.println("You didn't pass the trivia.");
        }
    }
}