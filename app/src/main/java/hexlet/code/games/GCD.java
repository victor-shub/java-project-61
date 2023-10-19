package hexlet.code.games;

import java.math.BigInteger;
import hexlet.code.Engine;

public class GCD {
    public static void play() {
        var task = "Find the greatest common divisor of given numbers.";
        Engine.getGameBody(generateQuestionsAndAnswers(), task);
    }
    static String[][] generateQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[2][Engine.QuestionsCount];
        final int gcdBound = 1000;
        for (var i = 0; i < Engine.QuestionsCount; i++) {
            var firstNum = Even.generateRandomNumber(gcdBound);
            var secondNum = Even.generateRandomNumber(gcdBound);
            questionsAndAnswers[0][i] = firstNum + " " + secondNum;
            questionsAndAnswers[1][i] = "" + gcd(firstNum, secondNum);
        }
        return questionsAndAnswers;
    }
    static int gcd(int firstNum, int secondNum) {
        var b1 = BigInteger.valueOf(firstNum);
        var b2 = BigInteger.valueOf(secondNum);
        var gcd = b1.gcd(b2);
        return gcd.intValue();
    }
}
