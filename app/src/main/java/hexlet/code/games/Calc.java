package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int calcBound = 100;
    private static final String[] operators = {"*", "-", "+"};
    public static void play() {
        var task = "What is the result of the expression?";
        Engine.getGameBody(generateQuestionsAndAnswers(), task);
    }

    private static String[][] generateQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[2][Engine.QUESTIONS_COUNT];
        for (var i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            var firstNum = Utils.generateRandomInt(0, calcBound);
            var secondNum = Utils.generateRandomInt(0, calcBound);
            var operator = operators[Utils.generateRandomInt(0, operators.length)];
            questionsAndAnswers[0][i] = firstNum + " " + operator + " " + secondNum;
            questionsAndAnswers[1][i] = "" + calculate(firstNum, secondNum, operator);
        }
        return questionsAndAnswers;
    }

    public static int calculate(int firstNum, int secondNum, String operator) {
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
        return answer;
    }
}
