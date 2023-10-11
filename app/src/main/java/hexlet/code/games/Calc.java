package hexlet.code.games;

import java.util.Random;
import hexlet.code.Game;
import hexlet.code.Engine;

public class Calc implements Game {
    public static void play() {
        Calc game = new Calc();
        var task = "What is the result of the expression?";
        Engine.getGameBody(game, task);
    }
    public String getQuestion() {
        String question = Even.getRandomNumber() + " " + getRandomOperator() + " " + Even.getRandomNumber();
        return question;
    }
    public String questionToAnswer(String question) {
        var firstNum = Integer.parseInt(question.substring(0, 2));
        var secondNum = Integer.parseInt(question.substring(5));
        var answer = "";
        switch (question.substring(3, 4)) {
            case "+":
                answer += firstNum + secondNum;
                break;
            case "-":
                answer += firstNum - secondNum;
                break;
            case "*":
                answer += firstNum * secondNum;
                break;
        }
        return answer;
    }
    static String getRandomOperator() {
        Random r = new Random();
        var num = r.nextInt(3);
        var operator = switch (num) {
            case 0 -> "+";
            case 1 -> "-";
            case 2 -> "*";
            default -> "";
        };
        return operator;
    }
}
