package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int QUESTIONS_COUNT = 3;

    public static void getGameBody(String[][] questionsAndAnswers, String task) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(task);
        var wrongAnswerMessage = "' is wrong answer ;(. Correct answer was '";
        for (var i = 0; i < QUESTIONS_COUNT; i++) {
            var question = questionsAndAnswers[0][i];
            var correctAnswer = questionsAndAnswers[1][i];
            Scanner scannedAnswer = new Scanner(System.in);
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scannedAnswer.next();
            if (!userAnswer.equals(correctAnswer)) {
                System.out.println("'" + userAnswer + wrongAnswerMessage + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
            System.out.println("Correct!");
            if (i == QUESTIONS_COUNT - 1) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
