package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Progression {
    private static final int seqLength = 10;
    private static final int lowFirstNumBound = -100;
    private static final int highFirstNumBound = 100;
    private static final int lowStepBound = -10;
    private static final int highStepBound = 10;
    public static void play() {
        var task = "What number is missing in the progression?";
        Engine.getGameBody(generateQuestionsAndAnswers(), task);
    }

    static String[][] generateQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[2][Engine.QUESTIONS_COUNT];
        var skippedSeqNum = 0;
        for (var i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            int[] seqNums = generateRandomProgression();
            var skipNum = Utils.generateRandomInt(0, seqLength);
            var question = new StringBuilder();
            for (var j = 0; j < seqLength; j++) {
                if (j == skipNum) {
                    question.append(".. ");
                    skippedSeqNum = seqNums[j];
                } else {
                    question.append(seqNums[j]);
                    question.append(" ");
                }
            }
            questionsAndAnswers[0][i] = question.toString();
            questionsAndAnswers[1][i] = "" + skippedSeqNum;
        }
        return questionsAndAnswers;
    }
    static int[] generateRandomProgression() {
        int[] progression = new int[seqLength];
        var seqNum = Utils.generateRandomInt(lowFirstNumBound, highFirstNumBound);
        var stepNum = Utils.generateRandomInt(lowStepBound, highStepBound);
        for (var i = 0; i < seqLength; i++) {
            progression[i] = seqNum;
            seqNum += stepNum;
        }
        return progression;
    }
}
