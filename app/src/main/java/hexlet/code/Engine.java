package hexlet.code;

import java.util.Scanner;

public class Engine {
    static void getGameBody(Game game, String task) {
        Scanner scannedName = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scannedName.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(task);
        for (var i = 0; i < 3; i++) {
            var question = game.getQuestion();
            var correctAnswer = game.questionToAnswer(question);
            Scanner scannedAnswer = new Scanner(System.in);
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scannedAnswer.next();
            if (!userAnswer.equals(correctAnswer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
            System.out.println("Correct!");
            if (i == 2) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
