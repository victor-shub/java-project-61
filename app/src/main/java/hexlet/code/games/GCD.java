package hexlet.code.games;

import java.math.BigInteger;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int gcdBound = 1000;
    public static void play() {
        var task = "Find the greatest common divisor of given numbers.";
        Engine.getGameBody(generateQuestionsAndAnswers(), task);
    }

    static String[][] generateQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[2][Engine.QUESTIONS_COUNT];
        for (var i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            var firstNum = Utils.generateRandomInt(0, gcdBound);
            var secondNum = Utils.generateRandomInt(0, gcdBound);
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
