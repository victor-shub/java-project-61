package hexlet.code.games;

import java.util.Random;
import hexlet.code.Game;
import hexlet.code.Engine;

public class Calc implements Game {
    private int firstNum;
    private int secondNum;
    private String operator;
    public static void play() {
        Calc game = new Calc();
        var task = "What is the result of the expression?";
        Engine.getGameBody(game, task);
    }
    public String getQuestion() {
        this.firstNum = Even.getRandomNumber();
        this.secondNum = Even.getRandomNumber();
        getRandomOperator();
        var question = firstNum + " " + operator + " " + secondNum;
        return question;
    }
    public String getAnswer() {
        var answer = firstNum;
        switch (operator) {
            case "+":
                answer += secondNum;
                break;
            case "-":
                answer -= secondNum;
                break;
            case "*":
                answer *= secondNum;
                break;
        }
        return "" + answer;
    }
    void getRandomOperator() {
        Random r = new Random();
        var num = r.nextInt(3);
        this.operator = switch (num) {
            case 0 -> "+";
            case 1 -> "-";
            case 2 -> "*";
            default -> null;
        };
    }
}
