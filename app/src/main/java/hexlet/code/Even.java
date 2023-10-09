package hexlet.code;

import java.util.Scanner;

class Even {
    static void play() {
        Scanner scannedName = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scannedName.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (var i = 0; i < 3; i++) {
            int num = getRandomNumber();
            var correctAnswer = evenOrNot(num);
            Scanner scannedAnswer = new Scanner(System.in);
            System.out.println("Question: " + num);
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
        scannedName.close();
    }
    static int getRandomNumber() {
        int num = (int) (Math.random() * 100000);
        return num;
    }
    static String evenOrNot(int num) {
        if (num % 2 == 0) {
            return "yes";
        }
        return "no";
    }
}
