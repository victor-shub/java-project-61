package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int CALC_BOUND = 100;
    private static final String[] OPERATORS = {"*", "-", "+"};
    private static final String TASK = "What is the result of the expression?";

    public static void play() {
        Engine.getGameBody(generateQuestionsAndAnswers(), TASK);
    }

    private static String[][] generateQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[2][Engine.QUESTIONS_COUNT];
        for (var i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            var firstNum = Utils.generateRandomInt(0, CALC_BOUND);
            var secondNum = Utils.generateRandomInt(0, CALC_BOUND);
            var operator = OPERATORS[Utils.generateRandomInt(0, OPERATORS.length)];
            questionsAndAnswers[0][i] = firstNum + " " + operator + " " + secondNum;
            questionsAndAnswers[1][i] = "" + calculate(firstNum, secondNum, operator);
        }
        return questionsAndAnswers;
    }

    public static Integer calculate(int firstNum, int secondNum, String operator) {
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
                return null;
        }
        return answer;
    }
}
