package hexlet.code;

import java.util.Scanner;

class Even {
    static void play() {
        int num = getRandomNumber();
        Scanner scannedAnswer = new Scanner(System.in);
        Cli.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        System.out.println("Question: " + num);
        System.out.print("Your answer: ");
        String answer = scannedAnswer.next();
    }
    static int getRandomNumber() {
        int num = Math.random() * 100000;
        return num;
    }
    static String isEven(int num) {
        if (num % 2 == 0) {
            return "yes";
        }
        return "no";
    }
}
