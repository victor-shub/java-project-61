package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int EVEN_BOUND = 1000;
    private static final String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void play() {
        Engine.getGameBody(generateQuestionsAndAnswers(), TASK);
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
