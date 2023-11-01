package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Prime {
    private static final int PRIME_BOUND = 1000;
    private static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void play() {
        Engine.getGameBody(generateQuestionsAndAnswers(), TASK);
    }
    private static String[][] generateQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[2][Engine.QUESTIONS_COUNT];
        for (var i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            var num = Utils.generateRandomInt(2, PRIME_BOUND);
            questionsAndAnswers[0][i] = String.valueOf(num);
            questionsAndAnswers[1][i] = Utils.booleanToYesOrNo(isPrime(num));
        }
        return questionsAndAnswers;
    }

    public static boolean isPrime(int num) {
        if (num > 2 && num % 2 == 0) {
            return false;
        }
        final int startNum = 3;
        for (int i = startNum; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
