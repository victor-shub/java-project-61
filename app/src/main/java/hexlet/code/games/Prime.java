package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Prime {
    private static final int primeBound = 1000;
    public static void play() {
        var task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.getGameBody(generateQuestionsAndAnswers(), task);
    }
    static String[][] generateQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[2][Engine.QUESTIONS_COUNT];
        for (var i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            var num = Utils.generateRandomInt(2, primeBound);
            questionsAndAnswers[0][i] = "" + num;
            questionsAndAnswers[1][i] = Utils.booleanToYesOrNo(isPrime(num));
        }
        return questionsAndAnswers;
    }

    static boolean isPrime(int num) {
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
