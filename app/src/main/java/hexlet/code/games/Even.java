package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int evenBound = 1000;
    public static void play() {
        var task = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.getGameBody(generateQuestionsAndAnswers(), task);
    }

    static String[][] generateQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[2][Engine.QUESTIONS_COUNT];
        for (var i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            var num = Utils.generateRandomInt(0, evenBound);
            questionsAndAnswers[0][i] = "" + num;
            questionsAndAnswers[1][i] = Utils.booleanToYesOrNo(num % 2 == 0);
        }
        return questionsAndAnswers;
    }
}
