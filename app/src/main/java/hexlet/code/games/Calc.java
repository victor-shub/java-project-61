package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.Engine;

public final class Calc implements Game {
    private int firstNum;
    private int secondNum;
    private String operator;
    public static void play() {
        Calc game = new Calc();
        var task = "What is the result of the expression?";
        Engine.getGameBody(game, task);
    }
    public String getQuestion() {
        final int calcBound = 100;
        this.firstNum = Even.getRandomNumber(calcBound);
        this.secondNum = Even.getRandomNumber(calcBound);
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
            default:
                break;
        }
        return "" + answer;
    }
    void getRandomOperator() {
        final int operatorCount = 3;
        var num = Even.getRandomNumber(operatorCount);
        this.operator = switch (num) {
            case 0 -> "+";
            case 1 -> "-";
            case 2 -> "*";
            default -> null;
        };
    }
}
