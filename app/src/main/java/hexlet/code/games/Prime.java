package hexlet.code.games;

import hexlet.code.Engine;

public final class Prime {
    public static void play() {
        final int primeQuestionsCount = 3;
        var task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.getGameBody(generateQuestionsAndAnswers(primeQuestionsCount), task);
    }
    static String[][] generateQuestionsAndAnswers(int questionsCount) {
        String[][] questionsAndAnswers = new String[2][questionsCount];
        final int primeBound = 1000;
        for (var i = 0; i < questionsCount; i++) {
            var num = Even.generateRandomNumber(primeBound);
            questionsAndAnswers[0][i] = "" + num;
            questionsAndAnswers[1][i] = Even.TrueOrFalseToYesOrNo(isPrime(num));
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
