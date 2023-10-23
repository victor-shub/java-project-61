package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int EVEN_BOUND = 1000;
    public static void play() {
        var task = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.getGameBody(generateQuestionsAndAnswers(), task);
    }

    private static String[][] generateQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[2][Engine.QUESTIONS_COUNT];
        for (var i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            var num = Utils.generateRandomInt(0, EVEN_BOUND);
            questionsAndAnswers[0][i] = "" + num;
            questionsAndAnswers[1][i] = Utils.booleanToYesOrNo(num % 2 == 0);
        }
        return questionsAndAnswers;
    }
}
