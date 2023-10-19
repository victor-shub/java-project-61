package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;

public class Even {
    public static void play() {
        var task = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.getGameBody(generateQuestionsAndAnswers(), task);
    }
    static int generateRandomNumber(int bound) {
        Random r = new Random();
        var num = r.nextInt(bound);
        return num;
    }
    static String[][] generateQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[2][Engine.questionsCount];
        final int evenBound = 1000;
        for (var i = 0; i < Engine.questionsCount; i++) {
            var num = generateRandomNumber(evenBound);
            questionsAndAnswers[0][i] = "" + num;
            questionsAndAnswers[1][i] = trueOrFalseToYesOrNo(isEven(num));
        }
        return questionsAndAnswers;
    }
    static boolean isEven(int num) {
        return num % 2 == 0;
    }
    static String trueOrFalseToYesOrNo(boolean value) {
        if (value) {
            return "yes";
        }
        return "no";
    }
}
