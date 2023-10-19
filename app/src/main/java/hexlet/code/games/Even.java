package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;

public class Even {
    public static void play() {
        final int evenQuestionsCount = 3;
        var task = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.getGameBody(generateQuestionsAndAnswers(evenQuestionsCount), task);
    }
    static int generateRandomNumber(int bound) {
        Random r = new Random();
        var num = r.nextInt(bound);
        return num;
    }
    static String[][] generateQuestionsAndAnswers(int questionsCount) {
        String[][] questionsAndAnswers = new String[2][questionsCount];
        final int evenBound = 1000;
        for (var i = 0; i < questionsCount; i++) {
            var num = generateRandomNumber(evenBound);
            questionsAndAnswers[0][i] = "" + num;
            questionsAndAnswers[1][i] = TrueOrFalseToYesOrNo(isEven(num));
        }
        return questionsAndAnswers;
    }
    static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
    static String TrueOrFalseToYesOrNo(boolean value) {
        if (value) {
            return "yes";
        }
        return "no";
    }
}
