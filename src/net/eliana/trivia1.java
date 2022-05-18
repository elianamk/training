package net.eliana;

import java.util.Scanner;

public class trivia1 {
    public static void main(String[] args) {



        int question1 = 27;
        int question2 = 4;
        int question3 = 2;
        int yourScore = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is Halsey's age?");
        question1 = scanner.nextInt();
        System.out.println("How many albums does Halsey have?");
        question2 = scanner.nextInt();
        System.out.println("How many siblings does Halsey have?");
        question3 = scanner.nextInt();

        if(question1 == 27) {
            yourScore++;
        }
        if(question2 == 4) {
            yourScore++;
        }

        if(question3 == 2) {
            yourScore++;
        }

        switch (yourScore) {
            case 1, 2 -> System.out.println("You passed the trivia " + true + " with " + yourScore + " points!");
            case 3 -> System.out.println("You nailed the trivia " + true + " with " + yourScore + " points!");
            default -> System.out.println("You didn't pass the trivia.");
        }
    }
}
