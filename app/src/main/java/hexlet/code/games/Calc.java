package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void play() {
        final int calcQuestionsCount = 3;
        var task = "What is the result of the expression?";
        Engine.getGameBody(generateQuestionsAndAnswers(calcQuestionsCount), task);
    }
    static String[][] generateQuestionsAndAnswers(int questionsCount) {
        String[][] questionsAndAnswers = new String[2][questionsCount];
        final int calcBound = 100;
        for (var i = 0; i < questionsCount; i++) {
            var firstNum = Even.generateRandomNumber(calcBound);
            var secondNum = Even.generateRandomNumber(calcBound);
            var operator = generateRandomOperator();
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
    static String generateRandomOperator() {
        final int operatorsCount = 3;
        var num = Even.generateRandomNumber(operatorsCount);
        var operator = switch (num) {
            case 0 -> "+";
            case 1 -> "-";
            case 2 -> "*";
            default -> null;
        };
        return operator;
    }
}
