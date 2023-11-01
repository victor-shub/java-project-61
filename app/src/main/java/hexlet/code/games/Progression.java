package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Progression {
    private static final int SEQ_LENGTH = 10;
    private static final int LOW_FIRST_NUM_BOUND = -100;
    private static final int HIGH_FIRST_NUM_BOUND = 100;
    private static final int LOW_STEP_BOUND = -10;
    private static final int HIGH_STEP_BOUND = 10;
    private static final String TASK = "What number is missing in the progression?";

    public static void play() {
        Engine.getGameBody(generateQuestionsAndAnswers(), TASK);
    }

    private static String[][] generateQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[2][Engine.QUESTIONS_COUNT];
        for (var i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            var seqNum = Utils.generateRandomInt(LOW_FIRST_NUM_BOUND, HIGH_FIRST_NUM_BOUND);
            var stepNum = Utils.generateRandomInt(LOW_STEP_BOUND, HIGH_STEP_BOUND);
            var seqNums = generateProgression(seqNum, stepNum, SEQ_LENGTH);
            var skipNum = Utils.generateRandomInt(0, SEQ_LENGTH);
            questionsAndAnswers[1][i] = seqNums[skipNum];
            seqNums[skipNum] = "..";
            questionsAndAnswers[0][i] = String.join(" ", seqNums);
        }
        return questionsAndAnswers;
    }

    public static String[] generateProgression(int seqNum, int stepNum, int seqLength) {
        String[] progression = new String[seqLength];
        for (var i = 0; i < seqLength; i++) {
            progression[i] = String.valueOf(seqNum);
            seqNum += stepNum;
        }
        return progression;
    }
}
