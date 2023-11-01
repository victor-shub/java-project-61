package hexlet.code.games;

import java.math.BigInteger;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int GCD_BOUND = 1000;
    private static final String TASK = "Find the greatest common divisor of given numbers.";

    public static void play() {
        Engine.getGameBody(generateQuestionsAndAnswers(), TASK);
    }

    private static String[][] generateQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[2][Engine.QUESTIONS_COUNT];
        for (var i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            var firstNum = Utils.generateRandomInt(0, GCD_BOUND);
            var secondNum = Utils.generateRandomInt(0, GCD_BOUND);
            questionsAndAnswers[0][i] = firstNum + " " + secondNum;
            questionsAndAnswers[1][i] = String.valueOf(gcd(firstNum, secondNum));
        }
        return questionsAndAnswers;
    }

    public static int gcd(int firstNum, int secondNum) {
        var b1 = BigInteger.valueOf(firstNum);
        var b2 = BigInteger.valueOf(secondNum);
        var gcd = b1.gcd(b2);
        return gcd.intValue();
    }
}
