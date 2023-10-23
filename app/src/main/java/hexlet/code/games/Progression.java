package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Progression {
    private static final int gameSeqLength = 10;
    private static final int lowFirstNumBound = -100;
    private static final int highFirstNumBound = 100;
    private static final int lowStepBound = -10;
    private static final int highStepBound = 10;
    public static void play() {
        var task = "What number is missing in the progression?";
        Engine.getGameBody(generateQuestionsAndAnswers(), task);
    }

    private static String[][] generateQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[2][Engine.QUESTIONS_COUNT];
        for (var i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            var seqNum = Utils.generateRandomInt(lowFirstNumBound, highFirstNumBound);
            var stepNum = Utils.generateRandomInt(lowStepBound, highStepBound);
            int[] seqNums = generateProgression(seqNum, stepNum, gameSeqLength);
            var skipNum = Utils.generateRandomInt(0, gameSeqLength);
            var question = new StringBuilder();
            for (var j = 0; j < gameSeqLength; j++) {
                if (j == skipNum) {
                    question.append(".. ");
                } else {
                    question.append(seqNums[j]);
                    question.append(" ");
                }
            }
            questionsAndAnswers[0][i] = question.toString();
            questionsAndAnswers[1][i] = "" + seqNums[skipNum];
        }
        return questionsAndAnswers;
    }

    public static int[] generateProgression(int seqNum, int stepNum, int seqLength) {
        int[] progression = new int[seqLength];
        for (var i = 0; i < seqLength; i++) {
            progression[i] = seqNum;
            seqNum += stepNum;
        }
        return progression;
    }
}
