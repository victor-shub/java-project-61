package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static final int calcBound = 100;
    private static final String[] operators = {"*", "-", "+"};
    public static void play() {
        var task = "What is the result of the expression?";
        Engine.getGameBody(generateQuestionsAndAnswers(), task);
    }
    static String[][] generateQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[2][Engine.QUESTIONS_COUNT];
        for (var i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            var firstNum = Even.generateRandomNumber(calcBound);
            var secondNum = Even.generateRandomNumber(calcBound);
            var operator = operators[Even.generateRandomNumber(operators.length)];
            questionsAndAnswers[0][i] = firstNum + " " + operator + " " + secondNum;
            questionsAndAnswers[1][i] = "" + calculate(firstNum, secondNum, operator);
        }
        return questionsAndAnswers;
    }
    static int calculate(int firstNum, int secondNum, String operator) {
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
